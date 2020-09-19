
package DAO;

import Conexao.Conexao;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO {
    
    final String NOMEBANCO = "MercadoRachadel";
    final String NOMETABELA = "Funcionario";
    
    public boolean existe(FuncionarioDTO funcionario){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE Setor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getSetor());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        }
        catch(Exception e){
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean inserir(FuncionarioDTO funcionario){
        if (existe(funcionario) != true){
            try{
                Connection conn = Conexao.conectar(NOMEBANCO);
                String sql = "INSERT INTO " + NOMETABELA + " (ENDERECO, NOME, SETOR) VALUES (?, ?, ?);";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, funcionario.getEndereco());
                ps.setString(2, funcionario.getNome());
                ps.setString(3, funcionario.getSetor());
                
                
                ps.execute();
                
                ps.close();
                conn.close();
                return true;
            } catch(Exception e){
                System.err.println("Erro: " + e.toString());
                e.printStackTrace();
                return false;
            }
        }  
        return false;
    }
    
    public boolean alterar(FuncionarioDTO funcionario){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "UPDATE " + NOMETABELA + " SET ENDERECO = ?, NOME = ?, SETOR = ?,"
                    + " WHERE SETOR = ?;";
            
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, funcionario.getEndereco());
                ps.setString(2, funcionario.getNome());
                ps.setString(3, funcionario.getSetor());
                
                
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;                      
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
            
        }
    }
    
    public boolean excluir(FuncionarioDTO funcionario){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "DELETE FROM " + NOMETABELA + " WHERE SETOR = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getSetor());
            
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
            
        }
    }
    
    public List<FuncionarioDTO> montarLista (ResultSet rs){
        List<FuncionarioDTO> listModel = new ArrayList<FuncionarioDTO>();
        try{
            while (rs.next()){
                FuncionarioDTO registro = new FuncionarioDTO();
                registro.setSetor(rs.getString(1));
                registro.setEndereco(rs.getString(2));
                registro.setNome(rs.getString(3));
                listModel.add(registro);
            }
            return listModel;
        } catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }
    
    
    public List<FuncionarioDTO> pesquisar(){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "SELECT * FROM " + NOMETABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            List<FuncionarioDTO> listRegistro = montarLista(rs);
            ps.close();
            rs.close();
            conn.close();
            return listRegistro;
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }
    
    public FuncionarioDTO procurar (FuncionarioDTO funcionario){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE SETOR = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getSetor());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                FuncionarioDTO registro = new FuncionarioDTO();
                registro.setEndereco(rs.getString(2));
                registro.setNome(rs.getString(3));
                registro.setSetor(rs.getString(1));
                
                ps.close();
                rs.close();
                conn.close();
                return registro;              
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch (Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }
    
    
}

