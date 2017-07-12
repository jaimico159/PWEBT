<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!-- The HTML 4.01 Transitional DOCTYPE declaration-->
<!-- above set at the top of the file will set     -->
<!-- the browser's rendering engine into           -->
<!-- "Quirks Mode". Replacing this declaration     -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout.   -->

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Colegio Faraday</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="estilo1.css" type="text/css" />
</head>
<body id="top">
<div class="wrapper col1">
  <div id="header">
    <div class="fl_left">
      <h1><a href="/principal">Profesores Seleccionados</a></h1>
      <p>La mejor calidad en enseñanza</p>
    </div>
    <div class="fl_right"><img src="logo.jpg" alt="" /></div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <div id="topbar">
    <div id="topnav">
      <ul>
        <li><a href="/gmail">Inicio</a></li>
        <li><a href="#">Te ofrecemos</a>
          <ul>
            <li><a href="/Cursos">Cursos intensivos</a></li>
            <li><a href="/Profesores">Profesores Calificados</a></li>
          </ul>
        </li>
        
        <li><a href="/visita">Visitas</a></li>
        <li class="active"><a href="/contactanos">ContÃ¡ctanos</a></li>
        <li class="last"><a href="/trabajo">Trabaja con Nosotros</a></li>
      </ul>
    </div>
    <div id="search">
				<form action="/sesion?acceso=nuevo" method="post">
					<input type="submit" value="Iniciar Sesion">
				</form>
			</div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="featured_intro">
	<br><br>
	<table style="width:100%">
		<tr>
			<td>
				<iframe src="https://www.google.com.pe/maps/place/Colegio+Faraday/@-16.3976962,-71.5316386,15z/data=!4m5!3m4!1s0x0:0x4f0c7f6d511fd92d!8m2!3d-16.3976962!4d-71.5316386" width="400" height="300" frameborder="0" style="border:0"></iframe>
				<p>Colegio Faraday<br>
				Telf.: 246758  Cel.: 99999999</p>
			</td>
			<td><img src="puesto.jpg" alt="" style="width:400px"/></td>		
			<td><img src="celular.jpg" alt="" style="width:150px"/><br>Solo para emergencias</td>	
		</tr>
	</table>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col5">
<h1>Sugerencias y Reclamos</h1>
<div class="center">

 <form action="/reclamo" method="post">
          <p>
            <label for="name">Nombre:</label>
            <input type="text" name="name" value="" size="22"  />
          </p><br>
          <p>
            <label for="email">Email:</label>
            <input type="email" name="email"value="" size="22"  />
          </p><br>
        
          <p>
          <label for="asunto">Asunto:</label>
          <input type="text" name="asunto"value="" size="35" />
          </p>
     
          <p>
            <textarea name="reclamo" cols="150" rows="10"></textarea>
          </p><br>
 
          <p>*Nos pondremos en contacto con usted a traves de su email lo mas antes posible</p>
          
          <p>
            <input name="submit" type="submit" id="submit" value="Enviar" />
            &nbsp;
            <input name="reset" type="reset" id="reset" tabindex="5" value="Limpiar" />
          </p>
        </form>
        </div>
</div>
<!-- ####################################################################################################### -->
</body>
</html>
