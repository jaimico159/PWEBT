<!DOCTYPE html>
<html>
<head>
<title>Formulario</title>
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
	<form role="form" action="/addNota" method="post">
		<div class="form-group">
			<label for="ejemplo_email_1">Elegir ALumno</label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce tu email" name="correo">
		</div>
		<div class="form-group">
			<label for="ejemplo_password_1">Tipo</label><select
				class="form-control" id="sel1" name="tipo">
				<option value="administrador">administrador</option>
				<option value="director">director</option>
				<option value="secretario">secretario</option>
				<option value="profesor">profesor</option>
				<option value="estudiante">estudiante</option>
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