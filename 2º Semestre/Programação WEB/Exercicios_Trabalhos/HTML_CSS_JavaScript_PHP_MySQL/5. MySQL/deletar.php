<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
            include('conexao.php');
            if (isset($_GET['id'])){
                $id = $_GET['id'];
                $sql = "Delete from cadastro where id='$id'";
                $query = mysqli_query($conexao, $sql);
                
                if ($query){
                    header('location:listar.php');
                } else {
                    echo "Erro: Dados não foram deletados <br/>";
                    echo "Comando: ".$sql."<br/>";
                }
            }
        ?>
    </body>
</html>

