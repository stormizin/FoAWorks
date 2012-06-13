<?php
include("security.php");
protegePagina();
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
    $("#data").mask("99/99/9999");
    $("#horario").mask("99:99:99");
});    
</script>
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
              <li><a href="cadcomp.php">Cadastro de Companhia</a></li>
              <li id="menu_active"><a href="cadvoo.php">Cadastro de Voo</a></li>
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
    <div class="text1"> COMFORT<span>Guaranteed</span>
    </div>
  </div>
</div>
<div class="main">
  <section id="content">
    <article class="col1">
      <div class="pad_1">
          <br>
          <ul class="ul">
              <li class="li">Login: Entre com o nome de seu login no site.</li>
          </ul>
      </div>
    </article>
    <article class="col2 pad_left1">
        <center>
            <form name="dados" method="POST" id="ContactForm" action="inserirvoo.php" OnSubmit="return enviardados();">
                    <h2>Cadastre o voo da companhia.</h2>
          <div class="wrapper">
            <div class="bg">
             <select name="companhia">
                <?php 
                    $query = "SELECT id,nome FROM companhia_aerea";
                    $result = mysql_query($query);
                    
                    while($rows = mysql_fetch_array($result)){
                        $companhia = $rows['nome'];
                        $id = $rows['id'];
                        
                       echo "<option value = '$id'>$companhia</option>";
                    }
                ?>
                </select>
            </div>
            Companhia:<br />
          </div>          
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="data" id="data"/>
            </div>
            Data:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="horario" id="horario"/>
            </div>
            Horario:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="origem" id="origem"/>
            </div>
            Origem:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="destino" id="destino"/>
            </div>
            Destino:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="numero" id="numeros" maxlength="3"/>
            </div>
            Numero de vagas:<br />
          </div>
                    <input type="reset" name="limpar" value="Limpar" class="button1">
                    <input type="submit" name="enviar" value="Cadastrar!" class="button1">
            </form>
            <script language="javascript">
                function enviardados(){
                    if(document.dados.data.value == ""){
                        alert("O campo da data esta vazio.");
                        document.dados.data.focus();
                        return false;
                   }
                   if(document.dados.horario.value == ""){
                        alert("O campo do horario esta vazio.");
                        document.dados.horario.focus();
                        return false;
                   }
                   if(document.dados.origem.value == ""){
                        alert("O campo da origem esta vazio.");
                        document.dados.origem.focus();
                        return false;
                   }
                   if(document.dados.destino.value == ""){
                        alert("O campo do destino esta vazio.");
                        document.dados.destino.focus();
                        return false;
                   }
                   if(document.dados.numero.value == ""){
                        alert("O campo do numero de vagas disponivel esta vazio.");
                        document.dados.numero.focus();
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