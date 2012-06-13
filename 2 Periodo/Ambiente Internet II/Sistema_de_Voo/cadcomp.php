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
<script language="JavaScript">
jQuery(function($){
    $("#telefone").mask("(99)9999-9999");
    $("#cep").mask("99999-999");
    $("#cnpj").mask("99.999.999/9999-99");
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
              <li id="menu_active"><a href="cadcomp.php">Cadastro de Companhia</a></li>
              <li><a href="cadvoo.php">Cadastro de Voo</a></li>
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
            <form name="dados" id="ContactForm" action="inserircomp.php" method="POST" OnSubmit="return enviardados();">
                    <h2>Cadastre a companhia para adicionar voos</h2>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="nome" />
            </div>
            Nome:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="telefone" id="telefone"/>
            </div>
            Telefone:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="email"/>
            </div>
            E-mail:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="site" />
            </div>
            Site:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="cidade" />
            </div>
            Cidade:<br />
          </div>
                    <div class="wrapper">
               <div class="bg">
              <input type="text" class="input" readonly/>
            </div>
            Estado:<select name="estado">
                <option value="AC">AC</option>
                <option value="AL">AL</option>
                <option value="AM">AM</option>
                <option value="AP">AP</option>
                <option value="BA">BA</option>
                <option value="CE">CE</option>
                <option value="DF">DF</option>
                <option value="ES">ES</option>
                <option value="GO">GO</option>
                <option value="MA">MA</option>
                <option value="MG">MG</option>
                <option value="MS">MS</option>
                <option value="MT">MT</option>
                <option value="PA">PA</option>
                <option value="PB">PB</option>
                <option value="PE">PE</option>
                <option value="PI">PI</option>
                <option value="PR">PR</option>
                <option value="RJ">RJ</option>
                <option value="RN">RN</option>
                <option value="RO">RO</option>
                <option value="RS">RS</option>
                <option value="SC">SC</option>
                <option value="SE">SE</option>
                <option value="SP">SP</option>
                <option value="TO">TO</option>
            </select>
                    </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="bairro" />
            </div>
            Bairro:<br />
          </div>
          <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="endereco" />
            </div>
            Endereco:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="cep" id="cep"/>
            </div>
            CEP:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
              <input type="text" class="input" name="cnpj" id="cnpj"/>
            </div>
            CNPJ:<br />
          </div>
                    <div class="wrapper">
            <div class="bg">
                <textarea name="desc"></textarea>
            </div>
            Descricao:<br />
          </div>
                    <input type="reset" name="limpar" value="Limpar" class="button1">
                    <input type="submit" name="enviar" value="Cadastrar!" class="button1">
            </form>
            
            <script language="javascript">
                  function enviardados(){
                      if(document.dados.nome.value == ""){
                          alert("Campo nome esta vazio.");
                          document.dados.nome.focus();
                          return false;
                      }
                      if(document.dados.telefone.value == ""){
                          alert("Campo telefone esta vazio.");
                          document.dados.telefone.focus();
                          return false;
                      }
                      if(document.dados.email.value == ""){
                          alert("Campo email esta vazio.");
                          document.dados.email.focus();
                          return false;
                      }
                      if(document.dados.site.value == ""){
                           alert("Campo site esta vazio.");
                          document.dados.site.focus();
                          return false;
                      }
                      if(document.dados.cidade.value == ""){
                           alert("Campo cidade esta vazio.");
                          document.dados.cidade.focus();                         
                      }
                      if(document.dados.bairro.value == ""){
                           alert("Campo bairro esta vazio.");
                          document.dados.bairro.focus();
                          return false;
                      }
                      if(document.dados.cnpj.value == ""){
                           alert("Campo CNPJ esta vazio.");
                          document.dados.cnpj.focus();
                          return false;
                      }
                      if(document.dados.desc.value == ""){
                           alert("Campo descricao esta vazio.");
                          document.dados.desc.focus();
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
        <p class="lf">Copyright &copy; 2012 <a href="#">Air Lines</a> - All Rights Reserved</p>
        <div style="clear:both;"></div>
      </div>
    </footer>
  </div>
</div>
<script type="text/javascript"> Cufon.now(); </script>
<!-- END PAGE SOURCE -->
</body>
</html>