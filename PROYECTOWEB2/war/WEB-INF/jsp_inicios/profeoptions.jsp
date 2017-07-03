<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</div>
		
		<form role="form" action="/choseOption" method="post">
		
		<div class="form-group">
			<label for="ejemplo_password_1">Tipo</label><select
				class="form-control" id="sel1" name="opcion">
				<option value="agregar">Agregar Notas</option>
				<option value="editar">Editar Notas</option>
			</select>
		</div>

		<button type="submit" class="btn btn-default">Ir</button>
	</form>
	<%if(request.getParameter("opcion")!=null){
	if(request.getParameter("opcion").equals("agregar")){ %>
		<br><h3>AGREGAR NOTAS</h3>
		<jsp:include page="../formularios/formAddCorreo.html"></jsp:include>
		<%}else{ %>
		
		<br><br><br><br><h3>MODIFICAR NOTAS</h3>
		<jsp:include page="../formularios/formSearchCorreo.jsp"></jsp:include>
		<br>
		<a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Salir </a>
		<% } }%>

</body>
</html>