<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
            include('conexao.php');
            if (isset($_POST['submit'])){
                $nome = mysqli_real_escape_string($conexao, $_POST['nome']);
                $email = mysqli_real_escape_string($conexao, $_POST['email']);
                $sql = "Insert into cadastro values('','$nome','$email')";
                
                $query = mysqli_query($conexao, $sql);
                if ($query){
                    header("location:listar.php");
                } else {
                    echo "Erro: Dados não foram inseridos <br/>";
                    echo "Comando: ".$sql."<br/>";
                }
            }
        ?>
        <fieldset style="width:300px;">
            <form method="post" action="">
                Nome : <input type="text" name="nome"><br/>
                Email: <input type="text" name="email"><br/>
                <br/>
                <input type="submit" name="submit" value="Adicionar">
            </form>
        </fieldset>    
    </body>
</html>

