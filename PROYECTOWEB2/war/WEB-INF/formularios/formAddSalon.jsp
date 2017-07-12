<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Director</title>
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
	<form role="form" action="/addSalon" method="post">
		<div class="form-group">
			<label>Grado </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce el grado" name="grado">
		</div>
		<div class="form-group">
			<label>Sección </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce Sección" name="seccion">
		</div>
		<button type="submit" class="btn btn-default">Enviar</button>
	</form>
</body>
</html>