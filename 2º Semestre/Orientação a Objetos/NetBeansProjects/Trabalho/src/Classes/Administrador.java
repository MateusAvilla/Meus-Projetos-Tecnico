
package Classes;

import java.util.Date;

public class Administrador extends Docente {
    
    private String areadeadm;
    private int funcionariosadm;
    private String empresaadm;
    private String qualificacaoADM;
    private String cargoadm;

    public Administrador(String areadeadm, int funcionariosadm, String empresaadm, String qualificacaoADM, String cargoadm, String area, String escola, String cargo, String formacao, String disponibilidade, String cargah, float salario, double cartdtrab, String localtrab, String profissao) {
        super(area, escola, cargo, formacao, disponibilidade, cargah, salario, cartdtrab, localtrab, profissao);
        this.areadeadm = areadeadm;
        this.funcionariosadm = funcionariosadm;
        this.empresaadm = empresaadm;
        this.qualificacaoADM = qualificacaoADM;
        this.cargoadm = cargoadm;
    }

    public Administrador(String areadeadm, int funcionariosadm, String empresaadm, String qualificacaoADM, String cargoadm, String area, String escola, String cargo, String formacao, String disponibilidade, String cargah, float salario, double cartdtrab, String localtrab, String profissao, String nome, String sobrenome, int idade, double peso, double altura, Date nascimento) {
        super(area, escola, cargo, formacao, disponibilidade, cargah, salario, cartdtrab, localtrab, profissao, nome, sobrenome, idade, peso, altura, nascimento);
        this.areadeadm = areadeadm;
        this.funcionariosadm = funcionariosadm;
        this.empresaadm = empresaadm;
        this.qualificacaoADM = qualificacaoADM;
        this.cargoadm = cargoadm;
    }

    public String getAreadeadm() {
        return areadeadm;
    }

    public void setAreadeadm(String areadeadm) {
        this.areadeadm = areadeadm;
    }

    public int getFuncionariosadm() {
        return funcionariosadm;
    }

    public void setFuncionariosadm(int funcionariosadm) {
        this.funcionariosadm = funcionariosadm;
    }

    public String getEmpresaadm() {
        return empresaadm;
    }

    public void setEmpresaadm(String empresaadm) {
        this.empresaadm = empresaadm;
    }

    public String getQualificacaoADM() {
        return qualificacaoADM;
    }

    public void setQualificacaoADM(String qualificacaoADM) {
        this.qualificacaoADM = qualificacaoADM;
    }

    public String getCargoadm() {
        return cargoadm;
    }

    public void setCargoadm(String cargoadm) {
        this.cargoadm = cargoadm;
    }
    
    
}
