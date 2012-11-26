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
            <li><a href="index.php">Principal</a></li>
            <li><a href="candidato.php" class="current">Cadastrar</a></li>
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
            <center>
                <h2>Cadastro de Candidato!</h2>
                <form name="dados" action="cadcandidato.php" method="POST">
                <table>
                    <tr>
                        <td>CPF:</td><td><input type="text" name="cpf" maxlength="11"></td>
                        <tr>
                        <td>Senha:</td><td><input type="text" name="senha" maxlength="10"></td>
                        <tr>
                        <td>Nome:</td><td><input type="text" name="nome" maxlength="50"></td>
                        <tr>
                        <td>RG:</td><td><input type="text" name="rg" maxlength="9"></td>
                        <tr>
                        <td>Profissao:</td><td><input type="text" name="prof"></td>
                        <tr>
                        <td>Area Profissional:</td><td><input type="text" name="areaprof"></td>
                        <tr>
                            <td>Sexo:</td><td><input type="radio" name="sexo" value="M">M &nbsp; <input type="radio" name="sexo" value="F">F</td>
                        <tr>
                            <td>Data de Nascimento:</td><td><select size="1" name="dia">
                 <?php
                    echo "<option select value='01'>01</option>";
                    echo "<option select value='02'>02</option>";
                    echo "<option select value='03'>03</option>";
                    echo "<option select value='04'>04</option>";
                    echo "<option select value='05'>05</option>";
                    echo "<option select value='06'>06</option>";
                    echo "<option select value='07'>07</option>";
                    echo "<option select value='08'>08</option>";
                    echo "<option select value='09'>09</option>";
                    for($dia = 10; $dia<=31; $dia++){
                    echo "<option select value='$dia'>$dia</option>";
                    }
                    ?>
                </select>
              <select size="1" name="mes">
                                  <?php
                    echo "<option select value='01'>01</option>";
                    echo "<option select value='02'>02</option>";
                    echo "<option select value='03'>03</option>";
                    echo "<option select value='04'>04</option>";
                    echo "<option select value='05'>05</option>";
                    echo "<option select value='06'>06</option>";
                    echo "<option select value='07'>07</option>";
                    echo "<option select value='08'>08</option>";
                    echo "<option select value='09'>09</option>";
                for($mes = 10; $mes<=12; $mes++){
                    echo "<option select value='$mes'>$mes</option>";
                    }
                    ?>
              </select>
              <select size="1" name="ano">
                                    <?php
                                    for($ano = 1994; $ano >= 1900; $ano--){
                                    echo "<option select value='$ano'>$ano</option>";
                                    }
                                    ?>
                                </select>              
                            </td>
                        <tr><tr><tr><tr><tr><tr><tr><tr><tr><tr><tr><tr>
                            <td colspan="2"><center>Telefones</center></td>
                        <tr>
                        <td>Telefone Pessoal:</td><td><input type="text" name="telpess"></td>
                        <tr>
                        <td>Telefone Comercial:</td><td><input type="text" name="telcomer"></td>
                        <tr>
                        <td>Telefone Movel:</td><td><input type="text" name="telmovel"></td>
                        <tr><tr><tr><tr><tr><tr><tr><tr><tr><tr><tr><tr>
                            <td colspan="2"><center>Emails</center></td>
                        <tr>
                        <td>Email Pessoal:</td><td><input type="text" name="emailpess"></td>
                        <tr>
                        <td>Email Comercial:</td><td><input type="text" name="emailcomer"></td>
                        <tr><tr><tr><tr><tr><tr><tr><tr><tr><tr><tr><tr>
                        <td colspan="2"><center>Endereco</center></td>
                        <tr>
                        <td>Rua:</td><td><input type="text" name="rua"></td>
                        <tr>
                        <td>Numero:</td><td><input type="text" name="numero"></td>
                        <tr>
                        <td>Bairro:</td><td><input type="text" name="bairro"></td>
                        <tr>
                        <td>Cidade:</td><td><input type="text" name="cidade"></td>
                        <tr>
                        <td>Estado:</td><td><select name="uf">
                            <option value="RJ">RJ</option>
                            <option value="SP">SP</option>
                            <option value="SP">MG</option>
                        </select></td>
                        <tr>
                        <td colspan="2"><center><input type="submit" value="Cadastrar!"></center></td>
                </table></form>
            </center>
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