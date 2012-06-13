<?php
include("security.php");
protegePagina();
$user = $_SESSION['usuarioID'];
$name = $_SESSION['usuarioNome'];
if($user == 1)
{
    header("Location: cadcomp.php");
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
<title>AirLines | Contacts</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_italic_600.font.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_italic_400.font.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_400.font.js"></script>
</head>
<body id="page5">

<div class="body1">
  <div class="main">
    <header>
      <div class="wrapper">
        <h1><a href="index.html" id="logo">AirLines</a><span id="slogan">International Travel</span></h1>
        <div class="right">
          <nav>
            <ul id="top_nav">
              <li><a href="#"><img src="images/img1.gif" alt=""></a></li>
              <li><a href="#"><img src="images/img2.gif" alt=""></a></li>
              <li class="bg_none"><a href="#"><img src="images/img3.gif" alt=""></a></li>
            </ul>
          </nav>
          <nav>
            <ul id="menu">
              <li><a href="logout.php">Logout</a></li>
            </ul>
          </nav>
        </div>
      </div>
    </header>
  </div>
</div>
<div class="main">
  <div id="banner">
    <div class="text1"> CONFORTO<span>Garantido</span>
    </div>
  </div>
</div>
<div class="main">
  <section id="content">
    <article class="col1">
    </article>
      <center><h2>Bem-vindo <?php echo $name; ?></h2>
      <h3>Voos disponiveis para voce!</h3>
      <table border="1">
          <form name="dados" action="reservar.php" method="POST">
      <?php
        $query = "SELECT
    `data_voo`.`id`
    , `data_voo`.`dataa`
    , `clientes`.`name`
    , `clientes`.`cpf`
    , `data_voo`.`origem`
    , `data_voo`.`destino`
    , `data_voo`.`vagas_disp`
    , `data_voo`.`n_vagas`
    , `data_voo`.`horario`
    , `companhia_aerea`.`nome`
FROM
    `db_voo`.`clientes`, 
    `db_voo`.`data_voo`
    INNER JOIN `db_voo`.`companhia_aerea` 
        ON (`data_voo`.`idCompanhia` = `companhia_aerea`.`id`)";
        $result = mysql_query($query);
        
        while($rows = mysql_fetch_array($result))
        {
            $id = $rows['id'];
            $data = $rows['dataa'];
            //$horario = $rows['horario'];
            $origem = $rows['origem'];
            $destino = $rows['destino'];
            $n_vagas = $rows['n_vagas'];
            $vagas_disp = $rows['vagas_disp'];
            $clientenome = $rows['name'];
            $cpf = $rows['cpf'];
            $companhia = $rows['nome']; 
            ?>
              <input type="hidden" name="idvoo" value="<?php echo $id; ?>">
              <input type="hidden" name="cpf" value="<?php echo $cpf; ?>">
              <input type="hidden" name="clientenome" value="<?php echo $clientenome; ?>">
          <tr>
              <td>Data:</td><td><input type="text" name="data" value="<?php echo $data; ?>" readonly></td>
          <tr>
              <td>Origem:</td><td><input type="text" name="origem" value="<?php echo $origem ?>" readonly></td>
          <tr>
              <td>Destino:</td><td><input type="text" name="destino" value="<?php echo $destino; ?>" readonly></td>
          <tr>
              <td>Vagas:</td><td><input type="text" name="vagas" value="<?php echo $n_vagas; ?>" readonly></td>
          <tr>
              <td>Disponiveis:</td><td><input type="text" name="disp" value="<?php echo $vagas_disp; ?>" readonly></td>
          <tr>
              <td>Companhia:</td><td><?php echo $companhia; ?></td>
              <tr>
                  <td>Numero de Reservas:<input type="text" name="reservas" size="1" maxlength="2"></td>
                  <td><input type="submit" name="enviar" value="Reservar!"</td>
     <?php  
      }
      ?>
      </table>
</form>
      <br>
      
      </center>
  </section>
</div>
<div class="body2">
  <div class="main">
    <footer>
      <div class="footerlink">
        <p class="lf">Copyright &copy; 2012 <a href="#">Air Lines</a> - All Rights Reserved</p>
        <div style="clear:both;"></div>
      </div>
    </footer>
  </div>
</div>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>