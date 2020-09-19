<!DOCTYPE html>
<html lang="pt-br">
	<head>
	   <meta http-equiv="Content-Type"
	         content="text/html; charset=UTF-8">
           <link rel="stylesheet" type="text/css" href="css/EstiloPagPrincipal.css">
	   <title>
              Pagina Principal
	   </title>
	</head>

	<body>

	<?php

	if (isset($_POST['nome'])) {
			$_nome = $_POST['nome'];
		}

		else{
			$_nome = "";
		}

		if (isset($_POST['email'])) {
			$_email = $_POST['email'];
		}

		else{
			$_email = "";
		}

		if (isset($_POST['telefone'])) {
			$_telefone = $_POST['telefone'];
		}

		else{
			$_telefone = "";
		}

		if (isset($_POST['Estado'])) {
			$_estado = $_POST['Estado'];
		}

		else{
			$_estado = "";
		}



		if (isset($_POST['sure'])) {
			$_sure = $_POST['sure'];
		}

		else{
			$_sure = "";
		}

    if (isset($_POST['mensagem'])) {
			$_mensagem = $_POST['mensagem'];
		}

		else{
			$_mensagem = "";
		}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		if($_nome <> "") {
			echo " $_nome ";
		}

		if($_email <> "") {
			echo "$_email <br>";
		}

		if($_telefone <> "") {
			echo "$_telefone <br>";
		}

		if($_estado <> "") {
			echo "$_estado <br>";
		}

		if($_sure <> "") {
			echo "$_sure: <br><br>";
		}

		if($_mensagem <> "") {
			echo "$_mensagem <br>";
		}




		?>
	</body>
