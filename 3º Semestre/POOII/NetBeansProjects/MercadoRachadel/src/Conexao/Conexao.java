package Conexao;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pessoa
 */
public class Conexao {
    
    public static Connection conectar (String nomeBanco){
        try{
            String db_url = "jdbc:mysql://localhost/"+nomeBanco;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(db_url, "root", "");
            return con;
        }catch(Exception e){
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return null;
        }
    }
}