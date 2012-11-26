<?php
include("security.php");
echo $_SESSION['usuarioID'];

$usuariocpf = $_SESSION['usuarioID'];

$result = mysql_query("SELECT nivel_acesso FROM login WHERE cpf = $usuariocpf");
$data = mysql_fetch_assoc($result);
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
            <li><a href="#" class="current">Principal</a></li>
            <?php
            if($data['nivel_acesso'] == 2){
                echo "<li><a href='vaga.php'>Cadastrar Vaga</a></li>";
            }
            ?>
            <li><a href="logout.php"></a></li>
        </ul>    	
    
    </div>
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
            <center><h2>Vagas Disponiveis</h2></center>
                <center><?php
                $query = "SELECT * FROM vagas";
                $resultado = mysql_query($query);
                
                while($result = mysql_fetch_array($resultado)){
                    $cargo = $result['cargo'];
                    $min = $result['salario_min'];
                    $max = $result['salario_max'];
                    $vagas = $result['numero_vagas'];
                    $cidade = $result['cidade'];
                    $uf = $result['uf'];
                    $id = $result['cod_vaga'];
                    
                    echo "Cargo: ".$cargo."<br>";
                    echo "Salario Minimo: ".$min."<br>";
                    echo "Salario Maximo: ".$max."<br>";
                    echo "Vagas: ".$vagas."<br>";
                    echo "Cidade: ".$cidade."<br>";
                    echo "Estado: ".$uf."<br><br>";
                    echo "<a href='vaga_candidato.php?id=$id'>Candidatar-se a vaga</a>";
                }
                ?></center>
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