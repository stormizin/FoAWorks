<?php
include("security.php");
protegePagina();

$data = $_REQUEST['data'];
$horario = $_REQUEST['horario'];
$origem = $_REQUEST['origem'];
$destino = $_REQUEST['destino'];
$number = $_REQUEST['numero'];
$foreign = $_REQUEST['companhia'];

$query = "INSERT INTO data_voo (`dataa` , `horario` , `origem` , `destino`,`n_vagas`,`vagas_disp`,`idCompanhia`) VALUES
           ('$data','$horario','$origem','$destino','$number','$number','$foreign')";
mysql_query($query);
header("Location: logsucesso.php");

?>
