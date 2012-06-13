<?php
include("security.php");
protegePagina();

$nome = $_REQUEST['nome'];
$desc = $_REQUEST['desc'];
$end = $_REQUEST['endereco'];
$bairro = $_REQUEST['bairro'];
$cidade = $_REQUEST['cidade'];
$estado = $_REQUEST['estado'];
$cep = $_REQUEST['cep'];
$telefone = $_REQUEST['telefone'];
$email = $_REQUEST['email'];
$site = $_REQUEST['site'];
$cnpj = $_REQUEST['cnpj'];

$query = "INSERT INTO companhia_aerea (`descricao` , `endereco` , `bairro` , `cidade`,`estado`,`cep`,`telefone`,`email`,`site`,`cnpj`,`nome`) VALUES
('$desc','$end','$bairro','$cidade','$estado','$cep','$telefone','$email','$site','$cnpj','$nome')";
mysql_query($query);
header("Location: logsucesso.php");
?>