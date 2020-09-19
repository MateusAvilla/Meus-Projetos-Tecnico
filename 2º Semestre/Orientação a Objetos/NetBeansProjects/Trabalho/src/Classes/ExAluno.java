package Classes;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jvealuno
 */
public class ExAluno extends Pessoa {
    private String motivo;
    private Date dsaida;
    private Date dentrada;
    private String curso;
    private String dmensal;

    public ExAluno(String motivo, Date dsaida, Date dentrada, String curso, String dmensal) {
        this.motivo = motivo;
        this.dsaida = dsaida;
        this.dentrada = dentrada;
        this.curso = curso;
        this.dmensal = dmensal;
    }

    public ExAluno(String motivo, Date dsaida, Date dentrada, String curso, String dmensal, String nome, String sobrenome, int idade, double peso, double altura, Date nascimento) {
        super(nome, sobrenome, idade, peso, altura, nascimento);
        this.motivo = motivo;
        this.dsaida = dsaida;
        this.dentrada = dentrada;
        this.curso = curso;
        this.dmensal = dmensal;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getDsaida() {
        return dsaida;
    }

    public void setDsaida(Date dsaida) {
        this.dsaida = dsaida;
    }

    public Date getDentrada() {
        return dentrada;
    }

    public void setDentrada(Date dentrada) {
        this.dentrada = dentrada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDmensal() {
        return dmensal;
    }

    public void setDmensal(String dmensal) {
        this.dmensal = dmensal;
    }
    
    
    
}