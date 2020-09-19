<!DOCTYPE html>

<html lang="pt-br">

	<head>
	
	   <meta http-equiv="Content-Type" 
	         content="text/html; charset=UTF-8">
	   
	   <title>
              Página com PHP
	   </title>		
	   
	</head>

	<body>
	
		Primeira aula em PHP. <br>
		
		<?php 
		
			//Declarando variáveis
			
			$nome1 = " Tunico ";
			$nome2 = " Avilla ";
			$probabilidade = 100;
			$son = " Tunico Netto";
			$valor = 3.14;
			$separador = ' <br> <font color="Violet"> ********************************************************************************************************************************************************************************</font>';
			
	
			//Usando as variáveis
			
			echo " Um pequeno comando em php <br> ";
			echo " <br> Welcome ".$nome1;
			echo " <br>  E ai ".$nome2;
			
			echo "<br>" .$separador;
			
			echo "<br>Na probabilidade, o valor 1 é igual a " .$probabilidade; 
			echo "<br>Meu amigo que está aqui se chama ".$son;
			echo "<br>O valor mais conhecido de PI é igual a " .$valor;
			
			echo $separador;
			
			// no php, as variaveis podem armazenar valores do tipo inteiro, string e ponto flutuante (3.14)
			
			//outras coisninhas para fazer.
			
			$clima = "nublado";
			$tecnico = "Técnico de Informática";
			$colegio = "Escola Técnica Tupy";
			
			echo " <br><br> Hoje o dia está muito $clima !!";
			echo " <br> Estou aprendendo a fazer tudo isso no meu curso de  $tecnico na $colegio .";
			
			echo "<br>" .$separador;
			
			
			$texto = "<br> <br> Olá Mundo de um jeito";
			print ($texto);
			
			$texto = "<br><br> Olá ";
			$texto .= "Mundo de outro jeito";
			
			echo $texto;
			
			//guarda os dados na variavel $texto
			
			$texto1 = '<font color="red"> <br> <br> Olá Mundo em vermelho !! </font>';
			
			//escreve a variavel $texto
			
			echo $texto1;
			
			echo "<br>" .$separador;
			
			
			
		?>
		
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.0.min.js"></script>
<script type="text/javascript">
$(function(){
var cores = ['Snow', 'GhostWhite', 'WhiteSmoke', 'Gainsboro', 'FloralWhite', 'OldLace', 'Linen', 'AntiqueWhite', 'PapayaWhip', 'BlanchedAlmond', 'Bisque', 'PeachPuff', 'NavajoWhite', 'Moccasin', 'Cornsilk', 'Ivory', 'LemonChiffon', 'Seashell', 'Honeydew', 'MintCream', 'Azure', 'AliceBlue', 'lavender', 'LavenderBlush', 'MistyRose', 'DarkSlateGray', 'DimGrey', 'SlateGrey', 'LightSlateGray', 'Grey', 'LightGray', 'MidnightBlue', 'NavyBlue', 'CornflowerBlue', 'DarkSlateBlue', 'SlateBlue', 'MediumSlateBlue', 'LightSlateBlue', 'MediumBlue', 'RoyalBlue', 'Blue', 'Snow', 'GhostWhite', 'WhiteSmoke', 'Gainsboro', 'FloralWhite', 'OldLace', 'Linen', 'AntiqueWhite', 'PapayaWhip', 'BlanchedAlmond', 'Bisque', 'PeachPuff', 'NavajoWhite', 'Moccasin', 'Cornsilk', 'Ivory', 'LemonChiffon', 'Seashell', 'Honeydew', 'MintCream', 'Azure', 'AliceBlue', 'lavender', 'LavenderBlush', 'MistyRose', 'DarkSlateGray', 'DimGrey', 'SlateGrey', 'LightSlateGray', 'Grey', 'LightGray', 'MidnightBlue', 'NavyBlue', 'CornflowerBlue', 'DarkSlateBlue', 'SlateBlue', 'MediumSlateBlue', 'LightSlateBlue', 'MediumBlue', 'RoyalBlue', 'Blue', 'Snow', 'GhostWhite', 'WhiteSmoke', 'Gainsboro', 'FloralWhite', 'OldLace', 'Linen', 'AntiqueWhite', 'PapayaWhip', 'BlanchedAlmond', 'Bisque', 'PeachPuff', 'NavajoWhite', 'Moccasin', 'Cornsilk', 'Ivory', 'LemonChiffon', 'Seashell', 'Honeydew', 'MintCream', 'Azure', 'AliceBlue', 'lavender', 'LavenderBlush', 'MistyRose', 'DarkSlateGray', 'DimGrey', 'SlateGrey', 'LightSlateGray', 'Grey', 'LightGray', 'MidnightBlue', 'NavyBlue', 'CornflowerBlue', 'DarkSlateBlue', 'SlateBlue', 'MediumSlateBlue', 'LightSlateBlue', 'MediumBlue', 'RoyalBlue', 'Blue', 'Snow', 'GhostWhite', 'WhiteSmoke', 'Gainsboro', 'FloralWhite', 'OldLace', 'Linen', 'AntiqueWhite', 'PapayaWhip', 'BlanchedAlmond', 'Bisque', 'PeachPuff', 'NavajoWhite', 'Moccasin', 'Cornsilk', 'Ivory', 'LemonChiffon', 'Seashell', 'Honeydew', 'MintCream', 'Azure', 'AliceBlue', 'lavender', 'LavenderBlush', 'MistyRose', 'DarkSlateGray', 'DimGrey', 'SlateGrey', 'LightSlateGray', 'Grey', 'LightGray', 'MidnightBlue', 'NavyBlue', 'CornflowerBlue', 'DarkSlateBlue', 'SlateBlue', 'MediumSlateBlue', 'LightSlateBlue', 'MediumBlue', 'RoyalBlue', 'Blue', 'Snow', 'GhostWhite', 'WhiteSmoke', 'Gainsboro', 'FloralWhite', 'OldLace', 'Linen', 'AntiqueWhite', 'PapayaWhip', 'BlanchedAlmond', 'Bisque', 'PeachPuff', 'NavajoWhite', 'Moccasin', 'Cornsilk', 'Ivory', 'LemonChiffon', 'Seashell', 'Honeydew', 'MintCream', 'Azure', 'AliceBlue', 'lavender', 'LavenderBlush', 'MistyRose', 'DarkSlateGray', 'DimGrey', 'SlateGrey', 'LightSlateGray', 'Grey', 'LightGray', 'MidnightBlue', 'NavyBlue', 'CornflowerBlue', 'DarkSlateBlue', 'SlateBlue', 'MediumSlateBlue', 'LightSlateBlue', 'MediumBlue', 'RoyalBlue', 'Blue' ];
var tamanhoArray = cores.length;
var contador = 0;
setInterval(function(){
$("body").css("background-color",cores[contador]);
contador++;
if(contador>tamanhoArray){
contador = 0;
}
      },500);

 //vai chamar a funcao de 0,5 em 0,5 segundos
});

</script>
		
	</body>
	
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
	   Desenvolvido por Avilla e Antonio.
	</footer>
	
	</center>
</html>