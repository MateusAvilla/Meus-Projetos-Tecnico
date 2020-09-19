
package BO;
import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.util.List;


public class FuncionarioBO {
    public boolean inserir (FuncionarioDTO funcionariodto){
        FuncionarioDAO funciuonariodao = new FuncionarioDAO();
        funciuonariodao.inserir(funcionariodto);
        return true;
    }
    
    public boolean alterar (FuncionarioDTO funcionariodto){
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        funcionariodao.alterar(funcionariodto);
        return true;
    }
    
    public boolean excluir (FuncionarioDTO funcionariodto){
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        funcionariodao.excluir(funcionariodto);
        return true;
    }
    
    public List<FuncionarioDTO> pesquisar(){
        List<FuncionarioDTO> lista;
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        lista = funcionariodao.pesquisar();
        return lista;
    }
    
    public FuncionarioDTO procurar (FuncionarioDTO funcionariodto){
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        funcionariodto = funcionariodao.procurar(funcionariodto);
        return funcionariodto;
    }
    
    public boolean existe (FuncionarioDTO funcionariodto){
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        return funcionariodao.existe(funcionariodto);
    }
}
