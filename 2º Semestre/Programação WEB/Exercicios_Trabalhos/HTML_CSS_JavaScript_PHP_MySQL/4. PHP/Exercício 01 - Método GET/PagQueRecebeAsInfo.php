	<!DOCTYPE html>

	<html>

	<head>

		<title>
			Página que recebe as informações
		</title>

	</head>

	<center>

		<body>
				<h1 align="center"> 
					Informações enviadas do formulário. 
				</h1>
		<?php

		//Variáveis
		//get
		$_nome = $_GET ['txtnome'];
		$_sobrenome = $_GET ['txtsobrenome'];
		$_endereco = $_GET ['txtendereco'];
		$_numero = $_GET ['txtnumero'];
		$_telefone1 = $_GET ['txttelefone1'];
		$_telefone2 = $_GET ['txttelefone2'];
		$_email = $_GET ['txtemail'];
		$_gostaria = "";

		//set

		
		
		

		echo " Olá, seu nome é: " .$_nome. " " .$_sobrenome;
		echo " <br> Seu endereço é: " .$_endereco .", " .$_numero;
		echo " <br> Seu primeiro telefone é: " .$_telefone1. " e seu segundo telefone é: " .$_telefone2. ".";
		echo " <br> Seu email é: " .$_email. ".";

		//Opções do SELECT

		$_cidade = $_GET['cidade'];
		echo " <br> Sua cidade é: " .$_cidade;

		//Opções do RADIO
		if (isset($_GET['estadocivil']))
		{
			$_estadocivil = $_GET['estadocivil'];
		}

		else 
		{
			$_estadocivil = "";
		}

		echo " <br> Seu sexo é: " .$_estadocivil;

	//Opções das checkbox

	if(isset($_GET['musica']))
	{
		$_gostaria .= $_GET['musica'];
	}

	if(isset($_GET['teatro']))
	{
		$_gostaria .= $_GET['teatro'];
	}

	if(isset($_GET['esportes']))
	{
		$_gostaria .= $_GET['esportes'];
	}

	if(isset($_GET['mercadofinanceiro']))
	{
		$_gostaria .= $_GET['mercadofinanceiro'];
	}

	if(isset($_GET['cinema']))
	{
		$_gostaria .= $_GET['cinema'];
	}

	if(isset($_GET['culinaria']))
	{
		$_gostaria .= $_GET['culinaria'];
	}

	if(isset($_GET['informatica']))
	{
		$_gostaria .= $_GET['informatica'];
	}

	if(isset($_GET['carrosmotos'])){
		$_gostaria .= $_GET['carrosmotos'];
	}


		echo " <br> Você deseja receber informações sobre: " .$_gostaria;


		?>

		</body>
		
	</center>	


	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


	<center>
		
		<footer>
				Desenvolvido por Mateus Avilla e Antonio Netto.
		</footer>

	</center>

	</html>

	