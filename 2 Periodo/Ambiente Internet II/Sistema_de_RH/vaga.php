<?php
include("security.php");
?>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Select RH</title>
<meta name="keywords" content="free css templates, education, school, college, university, templatemo.com" />
<meta name="description" content="Education template is for academic related websites" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_header_wrapper">
    <div id="templatemo_header">
    	<div id="site_title">
            <h1><a href="http://www.templatemo.com" target="_parent">
                <img src="images/templatemo_logo.png" alt="Site Title" />
                <span>Sua vaga aqui!</span>
            </a></h1>
        </div>
        <p>Cadastre-se, acesse e inclua seu curriculum no banco de vagas da empresa não perca tempo!</p>
    
    </div> <!-- end of templatemo_header -->

</div> <!-- end of templatemo_menu_wrapper -->

<div id="templatemo_menu_wrapper">
    <div id="templatemo_menu">
        
        <ul>
            <li><a href="#">Principal</a></li>
            <li><a href="#" class="current">Cadastrar Vaga</a></li>
        </ul>    	
    
    </div> <!-- end of templatemo_menu -->
</div>

<div id="templatemo_content_wrapper">

	<div id="templatemo_sidebar">
    
    	<div class="sidebar_box">
        	
            <h2>Anuncios</h2>
            
            <div class="news_box">
                <a href="#">Site de RH abre mais de 10 vagas para a area de T.I</a>
                <p class="post_info">Postado por <span>Administrador</span> em <span>Abril 30, 2012</span></p>
            </div>
            
            <div class="news_box">
                <a href="#">Site de RH anuncia mais de 1000 vagas para o setor publico!</a>
                <p class="post_info">Postador por <span>Administrador</span> em <span>Setembro 22, 2012</span></p>
            </div>
            
            <div class="news_box">
                <a href="#">Novas vagas estao disponiveis no site!</a>
                <p class="post_info">Postado por <span>Administrador</span> em <span>Novembro 14, 2012</span></p>
            </div>
        
        </div><div class="sidebar_box_bottom"></div>
        
        <div class="sidebar_box">
			
            <h2>Informativos</h2>
            
            <form action="#" method="get">
            <label>Entre com o seu email caso queira receber atualizacoes do SELECT RH:</label>
            <input type="text" value="" name="username" size="10" id="input_field" title="usernmae" />
            <input type="submit" name="login" value="Subscribe" alt="login" id="submit_btn" title="Login" />
            </form>
            
            <div class="cleaner"></div>
        
        </div><div class="sidebar_box_bottom"></div>
    
    </div> <!-- end of sidebar -->
    
    <div id="templatemo_content">
    
    	<div class="content_box">
            <center><h2>Cadastro de Vagas</h2></center>
            <form name="dados" action="cadvaga.php" mathod="POST">
                <table>
                    <tr>
                        <td>Cargo:</td><td><input type="text" name="cargo"></td>
                    <tr>
                        <td>Salario Minimo:</td><td><input type="text" name="salmin"></td>
                    <tr>
                       <td>Salario Maximo:</td><td><input type="text" name="salmax"></td>
                    <tr>
                        <td>Numero Vagas:</td><td><input type="text" name="vagas"></td>
                    <tr>
                        <td>Cidade:</td><td><input type="text" name="cidade"></td>
                    <tr>
                        <td>Estado:</td><td><input type="text" name="estado" maxlength="2" size="1">(Ex: RJ)</td>
                    <tr>
                        <td colspan="2"><center><input type="submit" value="CADASTRAR!"></center></td>
                </table>
            </form>
            
        </div>
        
        <div class="content_box_bottom"></div>
    
    </div> 
    
    <div class="cleaner"></div>

</div>

<div id="templatemo_footer_wrapper">

    <div id="templatemo_footer">
                

    </div>
    
</div>
</body>
</html>