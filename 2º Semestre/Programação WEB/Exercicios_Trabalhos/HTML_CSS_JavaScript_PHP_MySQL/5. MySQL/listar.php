<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Simples Cadastro</title>
        <style type="text/css">
            td, th{padding: 5px; border:1px solid #ccc;}
        </style>    
    </head>
    <body>
        <?php
            include('conexao.php');
            $sql = "Select id, nome, email from cadastro";
            $query = mysqli_query($conexao, $sql);
            
            echo "<table><tr><th>Nome</th><th>Email</th><th>Alterar</th><th>Excluir</th>";
            echo "<tbody>";
            if ($query){
                while ($registro= mysqli_fetch_array($query)){
                    
                    echo "<tr><td>".$registro['nome']."</td>";
                    echo "<td>".$registro['email']."</td>";
                    echo "<td><center><a href='alterar.php?id=".$registro['id']."'>(+)</a></center></td>";
                    echo "<td><center><a href='deletar.php?id=".$registro['id']."'>(-)</a></center></td></tr>";
                }
            }    
            echo "</tbody>";
            echo "</table>"
        ?>
        <input type="button" name="cadastro" value="Novo Cadastro" onclick="parent.location='adicionar.php'">
    </body>
</html>

