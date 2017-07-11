<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.*"%>
<%@ page import="utilidades.*"%>
<%@ page import="estructura.Correos"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alumno</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"
	integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
	crossorigin="anonymous"></script>
<meta charset="utf-8">

<!-- Bootstrap core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="bootstrap/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="navbar.css" rel="stylesheet">
</head>
<body>
	<% List a =  CorreoUtilidades.getEntries(); %>
		<% ArrayList<Correos> lista = new ArrayList<Correos>(); %>
	<%for(int i=0;i<a.size();i++) %>
	<% lista.add(CorreoUtilidades.convertEntityToCorreos(a.get(i)); %>
	
	<table>
	<%if(!a.isEmpty()){ %>
		<% for(int i=0;i<a.size();i++){ %>
			<tr>
			<td><%lista.get(i).getCorreo(); %><td></td><%lista.get(i).getCondicion(); %></td><td><%lista.get(i).getTipo(); %></td>
			</tr>
		
		<%} %>
		
	<% } %>
	</table>
	

</body>
</html>