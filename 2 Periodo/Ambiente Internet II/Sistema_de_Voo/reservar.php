<?php
include("security.php");

   $n_voo = $_REQUEST['idvoo'];
   $dt_programacao = $_REQUEST['data'];
   $nomeCliente = $_REQUEST['clientenome'];
   $cpf = $_REQUEST['cpf'];
   $n_reservas = $_REQUEST['reservas'];
   $n_vagas = $_REQUEST['disp'];
   $cid_origem = $_REQUEST['origem'];
   $cid_destino = $_REQUEST['destino'];
   $day = date("y.m.d");
   
   $query = "INSERT INTO reservas (`n_voo`,`dt_reserva`,`dt_programacao`,`nomeCliente`,`cpf`,`n_reservas`,`cid_origem`,`cid_dest`)
       VALUES ('$n_voo','$day','$dt_programacao','$nomeCliente','$cpf','$n_reservas','$cid_origem','$cid_destino')";
   mysql_query($query);
  
   header("Location: principal.php");
?>