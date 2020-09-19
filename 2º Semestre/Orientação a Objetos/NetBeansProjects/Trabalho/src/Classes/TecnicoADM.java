/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author jvealuno
 */
public class TecnicoADM extends Empregado{
    private String cargo;
    private String departamento;
    private String qualificacaoADM;
    private String empresa;
    private int temdeemp;

    public TecnicoADM(String cargo, String departamento, String qualificacaoADM, String empresa, int temdeemp, String cargah, float salario, double cartdtrab, String localtrab, String profissao) {
        super(cargah, salario, cartdtrab, localtrab, profissao);
        this.cargo = cargo;
        this.departamento = departamento;
        this.qualificacaoADM = qualificacaoADM;
        this.empresa = empresa;
        this.temdeemp = temdeemp;
    }

    public TecnicoADM(String cargo, String departamento, String qualificacaoADM, String empresa, int temdeemp, String cargah, float salario, double cartdtrab, String localtrab, String profissao, String nome, String sobrenome, int idade, double peso, double altura, Date nascimento) {
        super(cargah, salario, cartdtrab, localtrab, profissao, nome, sobrenome, idade, peso, altura, nascimento);
        this.cargo = cargo;
        this.departamento = departamento;
        this.qualificacaoADM = qualificacaoADM;
        this.empresa = empresa;
        this.temdeemp = temdeemp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getQualificacaoADM() {
        return qualificacaoADM;
    }

    public void setQualificacaoADM(String qualificacaoADM) {
        this.qualificacaoADM = qualificacaoADM;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getTemdeemp() {
        return temdeemp;
    }

    public void setTemdeemp(int temdeemp) {
        this.temdeemp = temdeemp;
    }

    
}