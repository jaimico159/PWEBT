<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Secretario</title>
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
<script>
  function validarSiNumero(){
	  var b = Number(document.getElementById("dni").value);
	  var numero = parseInt(b);
    	if (!/(^([0-9]{8,8})|^)$/.test(numero)){
    	  alert("El valor " + b + " no es un número válido en el campo dni");
    	  alert("DNI debe tener 8 dígitos de solo números");
    	  return false;
    }
    return true;
  }
</script>
	<form role="form" action="/addSecretario" method="post" onsubmit="return validarSiNumero(this)">
		<div class="form-group">
			<label>Nombres </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce los nombres" name="nombres">
		</div>
		<div class="form-group">
			<label>Apellido Paterno </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce Ap. Paterno" name="ap_paterno">
		</div>
		<div class="form-group">
			<label>Apellido Materno </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce Ap. Materno" name="ap_materno">
		</div>
		
		<div class="form-group">
			<label>DNI:  </label> <input type="text"
				class="form-control" id="dni"
				placeholder="Introduce DNI" name="dni">
		</div>
		
		<div class="form-group">
			<label for="ejemplo_email_1">Email</label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce tu email" name="correo">
		</div>
		<div class="form-group">
			<label for="ejemplo_password_1">Tipo</label><select
				class="form-control" id="sel1" name="tipo">
				<option value="secretario">secretario</option>
			</select>
		</div>
		<label class="radio-inline"> <input type="radio"
			name="condicion" value="true">Activo
		</label> <label class="radio-inline"> <input type="radio"
			name="condicion" value="false">Inactivo
		</label>
		<button type="submit" class="btn btn-default">Enviar</button>
	</form>
</body>
</html>