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
public class Professor extends Docente {
    
    private String codigo;
    private String qualificacao;
    private String areapesq;
    private String titulacao;
    private String turmas;

    public Professor(String codigo, String qualificacao, String areapesq, String titulacao, String turmas, String area, String escola, String cargo, String formacao, String disponibilidade, String cargah, float salario, double cartdtrab, String localtrab, String profissao) {
        super(area, escola, cargo, formacao, disponibilidade, cargah, salario, cartdtrab, localtrab, profissao);
        this.codigo = codigo;
        this.qualificacao = qualificacao;
        this.areapesq = areapesq;
        this.titulacao = titulacao;
        this.turmas = turmas;
    }

    public Professor(String codigo, String qualificacao, String areapesq, String titulacao, String turmas, String area, String escola, String cargo, String formacao, String disponibilidade, String cargah, float salario, double cartdtrab, String localtrab, String profissao, String nome, String sobrenome, int idade, double peso, double altura, Date nascimento) {
        super(area, escola, cargo, formacao, disponibilidade, cargah, salario, cartdtrab, localtrab, profissao, nome, sobrenome, idade, peso, altura, nascimento);
        this.codigo = codigo;
        this.qualificacao = qualificacao;
        this.areapesq = areapesq;
        this.titulacao = titulacao;
        this.turmas = turmas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public String getAreapesq() {
        return areapesq;
    }

    public void setAreapesq(String areapesq) {
        this.areapesq = areapesq;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTurmas() {
        return turmas;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }

    
}