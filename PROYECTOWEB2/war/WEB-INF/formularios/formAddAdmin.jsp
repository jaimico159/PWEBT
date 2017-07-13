<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function validacion(){
		var dni = document.getElementById("dni"); 
		if (dni.) {
			    // Si no se cumple la condicion...
			    alert('[ERROR] El campo debe tener un valor de...');
			    return false;
			  }
			  else if (condicion que debe cumplir el segundo campo del formulario) {
			    // Si no se cumple la condicion...
			    alert('[ERROR] El campo debe tener un valor de...');
			    return false;
			  }
			  ...
			  else if (condicion que debe cumplir el último campo del formulario) {
			    // Si no se cumple la condicion...
			    alert('[ERROR] El campo debe tener un valor de...');
			    return false;
			  }
			 
			  // Si el script ha llegado a este punto, todas las condiciones
			  // se han cumplido, por lo que se devuelve el valor true
			  return true;
	}

</script>



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
	<form role="form" action="/addAdmin" method="post" onsubmit="return validacion()>
		<div class="form-group">
			<label>Nombres </label> <input type="text"
				class="form-control" id="nombres"
				placeholder="Introduce los nombres" name="nombres">
		</div>
		<div class="form-group">
			<label>Apellido Paterno </label> <input type="text"
				class="form-control" id="ap_paterno"
				placeholder="Introduce Ap. Paterno" name="ap_paterno">
		</div>
		<div class="form-group">
			<label>Apellido Materno </label> <input type="text"
				class="form-control" id="ap_materno"
				placeholder="Introduce Ap. Materno" name="ap_materno">
		</div>
		
		<div class="form-group">
			<label>DNI:  </label> <input type="text"
				class="form-control" id="dni"
				placeholder="Introduce DNI" name="dni">
		</div>
		
		<div class="form-group">
			<label for="ejemplo_email_1">Email</label> <input type="text"
				class="form-control" id="correo"
				placeholder="Introduce tu email" name="correo">
		</div>
		<div class="form-group">
			<label for="ejemplo_password_1">Tipo</label><select
				class="form-control" id="tipo" name="tipo">
				<option value="administrador">administrador</option>
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