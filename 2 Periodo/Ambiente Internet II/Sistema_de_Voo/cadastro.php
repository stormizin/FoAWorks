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
            <form name="dados" method="POST" id="ContactForm" action="ClienteCadInfo.php" OnSubmit="return enviardados();">
                    <h2>Cadastre-se para fazer reservas de voos</h2>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="login" />
            </div>
            Login:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="password" class="input" name="pass" />
            </div>
            Senha:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="password" class="input" name="passconf" />
            </div>
            Repita senha:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="primeiro" />
            </div>
            Primeiro Nome:<br />
          </div>
                    <input type="reset" name="limpar" value="Limpar" class="button1">
                    <input type="submit" name="enviar" value="Cadastrar!" class="button1">
            </form>
            <script language="javascript">
                function enviardados(){
                    if(document.dados.login.value == ""){
                        alert("O campo de login esta vazio.");
                        document.dados.login.focus();
                        return false;
                       }
                    if(document.dados.pass.value == ""){
                        alert("O campo de senha esta vazio.");
                        document.dados.pass.focus();
                        return false;
                       }
                    if(document.dados.passconf.value == ""){
                        alert("O campo que confirma a senha esta vazio.");
                        document.dados.passconf.focus();
                        return false;
                       }
                    if(document.dados.passconf.value != document.dados.pass.value)
                        {
                            alert("As senhas nao conferem!");
                            document.dados.passconf.focus();
                            return false;
                        }
                    if(document.dados.primeiro.value == "")
                        {
                            alert("Campo de nome vazio.");
                            document.dados.primeiro.focus();
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
<!-- END PAGE SOURCE -->
</body>
</html>