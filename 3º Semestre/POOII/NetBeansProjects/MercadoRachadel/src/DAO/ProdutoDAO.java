
package DAO;

import Conexao.Conexao;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
    
    final String NOMEBANCO = "mercadorachadel";
    final String NOMETABELA = "produto";
    
    public boolean existe(ProdutoDTO produto){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE Produto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getProduto());
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
    
    public boolean inserir(ProdutoDTO produto){
        if (existe(produto) != true){
            try{
                Connection conn = Conexao.conectar(NOMEBANCO);
                String sql = "INSERT INTO " + NOMETABELA + " (SETOR, PRODUTO, TIPO, FORNECEDOR) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, produto.getSetor());
                ps.setString(2, produto.getProduto());
                ps.setString(3, produto.getTipo());
                ps.setString(4, produto.getFornecedor());
                
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
    
    public boolean alterar(ProdutoDTO produto){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "UPDATE " + NOMETABELA + " SET SETOR = ?, PRODUTO = ?, TIPO = ?, FORNECEDOR = ?,"
                    + " WHERE PRODUTO = ?;";
            
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, produto.getSetor());
                ps.setString(2, produto.getProduto());
                ps.setString(3, produto.getTipo());
                ps.setString(4, produto.getFornecedor());
                
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
    
    public boolean excluir(ProdutoDTO produto){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "DELETE FROM " + NOMETABELA + " WHERE PRODUTO = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getProduto());
            
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
    
    public List<ProdutoDTO> montarLista (ResultSet rs){
        List<ProdutoDTO> listModel = new ArrayList<ProdutoDTO>();
        try{
            while (rs.next()){
                ProdutoDTO registro = new ProdutoDTO();
                registro.setSetor(rs.getString(1));
                registro.setProduto(rs.getString(2));
                registro.setTipo(rs.getString(3));
                registro.setFornecedor(rs.getString(4));
                listModel.add(registro);
            }
            return listModel;
        } catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }
    
    
    public List<ProdutoDTO> pesquisar(){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "SELECT * FROM " + NOMETABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            List<ProdutoDTO> listRegistro = montarLista(rs);
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
    
    public ProdutoDTO procurar (ProdutoDTO produto){
        try{
            Connection conn = Conexao.conectar(NOMEBANCO);
            String sql = "SELECT * FROM " + NOMETABELA + " WHERE PRODUTO = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getProduto());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ProdutoDTO registro = new ProdutoDTO();
                
                registro.setSetor(rs.getString(1));
                registro.setProduto(rs.getString(2));
                registro.setTipo(rs.getString(3));
                registro.setFornecedor(rs.getString(4));
                
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

