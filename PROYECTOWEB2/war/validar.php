<?php
	require("connect_bd.php");
	
	$username=$_POST['user'];
	$pass=$_POST['password'];
	echo $username;
	session_start();

	$sql=mysqli_query($link,"SELECT * FROM usuarios WHERE user='$username' ");
	if($f=mysqli_fetch_assoc($sql)){
		if($pass==$f['password']){
			$_SESSION['cod_alumno']=$f['cod_alumno'];
			$_SESSION['user']=$f['user'];

			header("Location: estudiante.php");
		}else{
			echo '<script>alert("CONTRASEÑA INCORRECTA")</script> ';
		
			echo "<script>location.href='login.php'</script>";
		}
	}else{
		
		echo '<script>alert("ESTE USUARIO NO EXISTE, MAS INFORMACION EN SECRETARIA")</script> ';
		
		echo "<script>location.href='login.php'</script>";	

	}
?>