<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<!DOCTYPE html>
<html>

<head>
<title>Información de la cuenta</title>
<meta charset=utf-8;>

<body>
	
	<h1>DATOS DEL ALUMNO</h1>
	
	<br>
	<a href='../'>Regresar...</a>
	<br />
	<b>User :</b>
	<br /> getNickname retornó : "+user.getNickname() 
	<br /> getEmail retornó : "+user.getEmail() 
	<br />
	<img src='imagenes/peon.jpg'>
	<br />
	
	<br><br><br><br><h3>VER NOTAS</h3>
		<jsp:include page="../formularios/formRegistroNotas.jsp"></jsp:include>
		<br>
		<a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Salir </a>
	
		
		

</body>
</html>