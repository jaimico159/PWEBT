<?php


		/*$mysqli = new MySQLi("localhost", "root","", "colegio");
		if ($mysqli -> connect_errno) {
			die( "Fallo la conexión a MySQL: (" . $mysqli -> mysqli_connect_errno() 
				. ") " . $mysqli -> mysqli_connect_error());
		}
		else
			echo "Conexión exitossa!";*/

	$link =mysqli_connect("localhost","root","","colegio");
	
?>