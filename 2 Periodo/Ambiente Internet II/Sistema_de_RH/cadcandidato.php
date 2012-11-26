<?php
include("security.php");

$cpf = $_REQUEST['cpf'];
$senha = $_REQUEST['senha'];
$nome = $_REQUEST['nome'];
$rg = $_REQUEST['rg'];
$prof = $_REQUEST['prof'];
$areaprof = $_REQUEST['areaprof'];
$sexo = $_REQUEST['sexo'];

//Data de Nascimento
$dia = $_REQUEST['dia'];
$mes = $_REQUEST['mes'];
$ano = $_REQUEST['ano'];
$datanasc = date("$ano.$mes.$dia");

//Telefone
$telpess = $_REQUEST['telpess'];
$telcomer = $_REQUEST['telcomer'];
$telmovel = $_REQUEST['telmovel'];

//Email
$emailpess = $_REQUEST['emailpess'];
$emailcomer = $_REQUEST['emailcomer'];

//Endereco
$rua = $_REQUEST['rua'];
$numero = $_REQUEST['numero'];
$bairro = $_REQUEST['bairro'];
$cidade = $_REQUEST['cidade'];
$estado = $_REQUEST['uf'];


$query = "INSERT INTO candidato (cpf,nome,data_nascimento,rg,profissao,area_profissional,sexo) VALUES ('$cpf', '$nome', '$datanasc', '$rg', '$prof', '$areaprof', '$sexo')";
mysql_query($query);
mysql_query("INSERT INTO email (email_pessoal, email_comercial, cpf) VALUES ('$emailpess', '$emailcomer', '$cpf')");
mysql_query("INSERT INTO telefone (telefone_pessoal, telefone_comercial, telefone_movel, cpf) VALUES ('$telpess', '$telcomer', '$telmovel', '$cpf')");
mysql_query("INSERT INTO endereco (rua, numero, bairro, cidade, uf, cpf) VALUES ('$rua','$numero', '$bairro', '$cidade', '$estado', '$cpf')");
mysql_query("INSERT INTO login (senha, nivel_acesso, cpf) VALUES ('$senha', '1', '$cpf')");
header("Location: sucesso.php");
exit(0);
?>