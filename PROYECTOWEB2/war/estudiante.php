<html>

<meta charset="ISO-8859-1"> 
<head>
    
    
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">	
	<link rel="stylesheet" href="css/estilos.css">
    
  
</head>

<body class="container" background="imagenes/solidblue.jpg" style="backgroung-attachment: fixed">

<nav class="nav nav-pills">
  <button type="button" class="btn btn-default" onclick="window.location.href='QuienesSomos.html'">Quienes Somos</button>
  <button type="button" class="btn btn-default">Programas educativos</button>
  <button type="button" class="btn btn-default" onclick="window.location.href='login.php'">Notas</button>
  <button type="button" class="btn btn-default" onclick="window.location.href='Profesores.html'">Profesores</button>
  <button type="button" class="btn btn-default">Actividades Academicas</button>
  
</nav>

<?php 
session_start();
require 'connect_bd.php';
$cod=$_SESSION['cod_alumno'];

$nombre_curso[]="Aritmetica";
$nombre_curso[]="Aritmetica";
$nombre_curso[]="Algebra";
$nombre_curso[]="Algebra";
$nombre_curso[]="Tringonometria";
$nombre_curso[]="Razonamiento Logico";
$nombre_curso[]="Razonamiento Matematico";
$nombre_curso[]="Historia";
$nombre_curso[]="Geografia";
$nombre_curso[]="Psicologia";
$nombre_curso[]="Filosofia";
$nombre_curso[]="Fisica I";
$nombre_curso[]="Fisica II";
$nombre_curso[]="Fisica III";
$nombre_curso[]="Quimica I";
$nombre_curso[]="Quimica II";
$nombre_curso[]="Biologia";
$nombre_curso[]="Anatomia";
$nombre_curso[]="Geometria";


$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR001' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR002' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR003' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR004' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR005' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR006' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR007' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR008' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR009' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR010' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR011' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR012' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR013' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR014' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR015' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR016' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR017' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR018' ORDER BY id_bimestre ASC");
$result1[] = mysqli_query($link,"SELECT * FROM notas WHERE cod_alumno='$cod' and cod_materia='CFCUR019' ORDER BY id_bimestre ASC");

$cursos = mysqli_query($link, "SELECT * FROM grado WHERE cod_grado='1' or '2' or '3' ");



?>


<!-- Menú de navegación del sitio -->


<br><br>
<aside>

</aside>


<section>

<?php 
$i=0;
while ($i<19){
	
	echo "<h3>Curso:".$nombre_curso[$i]."</h3>
<table class="."table table-striped table-bordered".">
	<tr>
		<th>Bimestre</th>
		<th>Primer Examen</th>
		<th>Segundo Examen</th>
		<th>Tercer Examen</th>
		<th>Cuarto Examen</th>
		<th>Promedio</th>
	</tr> ";
	
	if (mysqli_num_rows($result1[$i]) > 0) {
		// output data of each row
		while($row = mysqli_fetch_assoc($result1[$i])) {
			echo "<tr>";
			echo "<td>". $row["id_bimestre"]."</td>";
			echo "<td>". $row["primer_rank"]."</td>";
			echo "<td>". $row["segundo_rank"]."</td>";
			echo "<td>". $row["tercer_rank"]."</td>";
			echo "<td>". $row["cuarto_rank"]."</td>";
			echo "<td>". $row["promedio_bimestre"]."</td></tr>";
	
		}
	
	} else {
		echo "0 resultados";
	}
	echo "</table></section>";
	
	$i=$i+1;
	
	
}

/*if (mysqli_num_rows($result1[2]) > 0) {
	// output data of each row
	while($row = mysqli_fetch_assoc($result1[2])) {
		echo "<tr>";
		echo "<td>". $row["id_bimestre"]."</td>";
		echo "<td>". $row["primer_rank"]."</td>";
		echo "<td>". $row["segundo_rank"]."</td>";
		echo "<td>". $row["tercer_rank"]."</td>";
		echo "<td>". $row["cuarto_rank"]."</td>";
		echo "<td>". $row["promedio_bimestre"]."</td></tr>";
		
	}
	
} else {
	echo "0 resultados";
}

*/

?>
	
	  

<?php 




?>


<a href = "Pagina.html">Regresar a Página principal</a>

</body>
</html>