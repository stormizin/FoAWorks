CREATE TABLE tipo (
	id number(5) primary key,
	nome varchar2(70) unique not null
);

CREATE TABLE produto (
	id number(5) primary key,
	id_tipo number(5) not null references tipo(id),
	nome varchar2(70) unique not null,
	valor number(6, 2) not null check(valor > 0),
	qtde_estoque number(5) not null check(qtde_estoque >= 0)
);

CREATE TABLE fornecedor (
	id number(5) primary key,
	nome varchar2(70) not null,
	cgc char(14) unique not null,
	tel1 char(11) not null,
	tel2 char(11),
	endereco varchar2(150) not null
);

CREATE TABLE produto_fornecedor (
	id_produto number(5) references produto(id),
	id_fornecedor number(5) references fornecedor(id),
	constraint pf_pk primary key (id_produto, id_fornecedor)
);

CREATE TABLE funcionario (
	matricula char(9) primary key,
	nome varchar2(70) not null,
	sexo char(1) not null check (sexo = 'M' or sexo = 'F')
);

CREATE TABLE pedido (
	id number(5) primary key,
	data date not null,
	matricula char(9) not null references funcionario(matricula)
);

CREATE TABLE pedido_produto_fornecedor (
	id_pedido number(5) references pedido(id),
	id_produto number(5) references produto(id),
	id_fornecedor number(5) references fornecedor(id),
	qtde number(5) not null check (qtde > 0),
	valor_unitario number(6, 2) not null check (valor_unitario > 0),
	percentual_desconto number(5) not null check (percentual_desconto >= 0 and percentual_desconto <= 100),
	constraint ppf_pk primary key (id_pedido, id_produto, id_fornecedor)
);

CREATE SEQUENCE tipo_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE produto_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE fornecedor_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE pedido_seq START WITH 1 INCREMENT BY 1;

INSERT INTO tipo VALUES (tipo_seq.nextval, 'Produto Comum');
INSERT INTO tipo VALUES (2, 'Produto Especial');

INSERT INTO produto VALUES (produto_seq.nextval, 1, 'Coca-Cola', 2.50, 30);
INSERT INTO produto VALUES (2, 2, 'Feijão Amigo', 10.0, 10);

INSERT INTO fornecedor VALUES (fornecedor_seq.nextval, 'Fábrica da Coca', '92849794000180', '33230123', null, 'Porto Real - RJ');
INSERT INTO fornecedor VALUES (2, 'Fábrica da Amigo', '43249452000114', '33231234', null, 'Varre-sai - RJ');

INSERT INTO produto_fornecedor VALUES (1, 1);
INSERT INTO produto_fornecedor VALUES (2, 2);

INSERT INTO funcionario VALUES ('201110482', 'José', 'M');
INSERT INTO funcionario VALUES ('201110483', 'Maria', 'F');

INSERT INTO pedido VALUES (pedido_seq.nextval, TO_DATE('2013-08-04 13:38:00', 'YYYY-MM-DD HH24:MI:SS'), '201110482');
INSERT INTO pedido VALUES (2, TO_DATE('2013-08-03 00:05:12', 'YYYY-MM-DD HH24:MI:SS'), '201110483');

INSERT INTO pedido_produto_fornecedor VALUES (2, 1, 1, 5, 2.50, 0);
INSERT INTO pedido_produto_fornecedor VALUES (1, 2, 2, 12, 9.0, 20);