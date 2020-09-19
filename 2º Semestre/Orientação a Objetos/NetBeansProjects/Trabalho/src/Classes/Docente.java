
package Classes;

import java.util.Date;


public class Docente extends Empregado {
    private String area;
    private String escola;
    private String cargo;
    private String formacao;
    private String disponibilidade;

    public Docente(String area, String escola, String cargo, String formacao, String disponibilidade, String cargah, float salario, double cartdtrab, String localtrab, String profissao) {
        super(cargah, salario, cartdtrab, localtrab, profissao);
        this.area = area;
        this.escola = escola;
        this.cargo = cargo;
        this.formacao = formacao;
        this.disponibilidade = disponibilidade;
    }

    public Docente(String area, String escola, String cargo, String formacao, String disponibilidade, String cargah, float salario, double cartdtrab, String localtrab, String profissao, String nome, String sobrenome, int idade, double peso, double altura, Date nascimento) {
        super(cargah, salario, cartdtrab, localtrab, profissao, nome, sobrenome, idade, peso, altura, nascimento);
        this.area = area;
        this.escola = escola;
        this.cargo = cargo;
        this.formacao = formacao;
        this.disponibilidade = disponibilidade;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    
    
}