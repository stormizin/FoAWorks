<?php
include("security.php");

$cargo = $_REQUEST['cargo'];
$salmin = $_REQUEST['salmin'];
$salmax = $_REQUEST['salmax'];
$vagas = $_REQUEST['vagas'];
$cidade = $_REQUEST['cidade'];
$estado = $_REQUEST['estado'];

mysql_query("INSERT INTO vagas (cargo, salario_min, salario_max, numero_vagas, cidade, uf) VALUES ('$cargo','$salmin','$salmax','$vagas','$cidade','$estado')");
header("Location: sucesso.php");
exit(0);
?>
