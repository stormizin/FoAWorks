<?php
include("security.php");

$nome = $_REQUEST['nome'];
$cpf = $_REQUEST['cpf'];
$endereco = $_REQUEST['endereco'];
$cidade = $_REQUEST['cidade'];
$bairro = $_REQUEST['bairro'];
$email = $_REQUEST['email'];
$telefone = $_REQUEST['telefone'];

$query = "INSERT INTO clientes (`nome`,`cpf`,`endereco`,`cidade`,`bairro`,`email`,`telefone`) VALUES 
('$nome','$cpf','$endereco','$cidade','$bairro','$email','$telefone')";
mysql_query($query);

?>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Air Lines - Cadastro</title>
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
<body id="page2">
<!-- START PAGE SOURCE -->
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
              <li><a href="index.php">Home</a></li>
              <li id="menu_active"><a href="cadastro.php">Cadastro</a></li>
              <li><a href="login.php">Login</a></li>
                            <li><a href="loginemp.php">Empresarial</a></li>
              <li><a href="contacts.php">Contato</a></li>
            </ul>
          </nav>
        </div>
      </div>
    </header>
  </div>
</div>
<div class="main">
  <div id="banner">
    <div class="text1"> COMFORT<span>Guaranteed</span>
    </div>
  </div>
</div>
<div class="main">
  <section id="content">
      <center>
        <h2>Informacoes cadastradas com sucesso!</h2>
        <img src="images/semi-success-icon.png"><br>
        <h2>Falta pouco faca o <a href="login.php">login</a> em nossa pagina!</h2>
        </center>
</div>
<div class="body2">
  <div class="main">
    <footer>
      <div class="footerlink">
        <p class="lf">Copyright &copy; 2010 <a href="#">Domain Name</a> - All Rights Reserved</p>
        <p class="rf"><a href="http://www.free-css.com/">Free CSS Templates</a> by <a href="http://www.templatemonster.com/">TemplateMonster</a></p>
        <div style="clear:both;"></div>
      </div>
    </footer>
  </div>
</div>
<script type="text/javascript"> Cufon.now(); </script>
<!-- END PAGE SOURCE -->
</body>
</html>