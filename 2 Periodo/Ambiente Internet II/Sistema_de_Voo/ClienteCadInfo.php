<?php
include("security.php");

$login = $_REQUEST['login'];
$senha = $_REQUEST['pass'];
$nome = $_REQUEST['primeiro'];

$query = "INSERT INTO usuario (`login`,`senha`,`nome`) VALUES ('$login','$senha','$nome')";
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
<script type="text/javascript" src="js/jquery.maskedinput-1.3.min.js"></script>
<script language="javascript">
    jQuery(function($){
       $("#telefone").mask("(99)9999-9999"); 
       $("#cpf").mask("999.999.999-99"); 
    });
</script>
</head>
<body id="page2">
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
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
    </div>
  </div>
</div>
<div class="main">
  <section id="content">
    <article class="col1">
      <div class="pad_1">
      </div>
    </article>
    <article class="col2 pad_left1">
        <center>
            <form name="dados" id="ContactForm" action="sucesso.php" method="POST" OnSubmit="return enviardados();">
                    <h2>Continuando com o cadastro ...</h2>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="nome" />
            </div>
            Nome:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="cpf" id="cpf"/>
            </div>
            CPF:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="endereco" />
            </div>
            Endereco:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="cidade" />
            </div>
            Cidade:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="bairro" />
            </div>
            Bairro:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="email" />
            </div>
            Email:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="telefone" id="telefone"/>
            </div>
            Telefone:<br />
          </div>
                    <input type="reset" name="limpar" value="Limpar" class="button1">
                    <input type="submit" name="enviar" value="Cadastrar!" class="button1">
            </form>
            <script language="javascript">
                function enviardados(){
                    if(document.dados.nome.value == ""){
                        alert("O campo de nome esta vazio.");
                        document.dados.nome.focus();
                        return false;
                    }
                    if(document.dados.cpf.value == ""){
                        alert("O campo de CPF esta vazio.");
                        document.dados.cpf.focus();
                        return false;
                    }
                    if(document.dados.endereco.value == ""){
                        alert("O campo de endereco esta vazio.");
                        document.dados.endereco.focus();
                        return false;
                    }
                    if(document.dados.cidade.value == ""){
                        alert("O campo de cidade esta vazio.");
                        document.dados.cidade.focus();
                        return false;
                    }
                    if(document.dados.bairro.value == ""){
                        alert("O campo de bairro esta vazio.");
                        document.dados.bairro.focus();
                        return false;
                    }
                    if(document.dados.email.value == ""){
                        alert("O campo de email esta vazio.");
                        document.dados.email.focus();
                        return false;
                    }
                    if(document.dados.telefone.value == ""){
                        alert("O campo de telefone esta vazio.");
                        document.dados.telefone.focus();
                        return false;
                    }
                }
        </script>
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
</body>
</html>