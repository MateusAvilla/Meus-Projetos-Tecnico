package BO;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import java.util.List;


public class ProdutosBO {

    public boolean inserir (ProdutoDTO produtodto){
        ProdutoDAO produtodao = new ProdutoDAO();
        produtodao.inserir(produtodto);
        return true;
    }
    
    public boolean alterar (ProdutoDTO produtodto){
        ProdutoDAO produtodao = new ProdutoDAO();
        produtodao.alterar(produtodto);
        return true;
    }
    
    public boolean excluir (ProdutoDTO produtodto){
        ProdutoDAO produtodao = new ProdutoDAO();
        produtodao.excluir(produtodto);
        return true;
    }
    
    public List<ProdutoDTO> pesquisar(){
        List<ProdutoDTO> lista;
        ProdutoDAO produtodao = new ProdutoDAO();
        lista = produtodao.pesquisar();
        return lista;
    }
    
    public ProdutoDTO procurar (ProdutoDTO produtodto){
        ProdutoDAO produtodao = new ProdutoDAO();
        produtodto = produtodao.procurar(produtodto);
        return produtodto;
    }
    
    public boolean existe (ProdutoDTO fichadto){
        ProdutoDAO fichadao = new ProdutoDAO();
        return fichadao.existe(fichadto);
    }
    
}
