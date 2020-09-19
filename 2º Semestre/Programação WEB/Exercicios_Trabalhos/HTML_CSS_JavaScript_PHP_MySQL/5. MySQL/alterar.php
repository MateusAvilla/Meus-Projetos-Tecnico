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
                
                if (isset($_POST['submit'])){
                    $nome =$_POST['nome'];
                    $email =$_POST['email'];
                    $sql = "Update cadastro set nome='$nome', email='$email' where id='$id'";
                    
                    $query = mysqli_query($conexao, $sql);
                    if ($query){
                        header('location:listar.php');
                    } else {
                        echo "Erro: Dados não foram alterados <br/>";
                        echo "Comando: ".$sql."<br/>";
                    }
                }
                $sql = "Select * from cadastro where id='$id'";
                $query1 = mysqli_query($conexao, $sql);
                $query2 = mysqli_fetch_array($query1);
        ?>
                <form method="post" action="">
                    Nome:<input type="text" name="nome" value="<?php echo $query2['nome']; ?>"/><br/>
                    Email:<input type="text" name="email" value="<?php echo $query2['email']; ?>"/><br/>
                    <br/>
                    <input type="submit" name="submit" value="Alterar">
                </form>
        <?php
            }
        ?>
    </body>
</html>
