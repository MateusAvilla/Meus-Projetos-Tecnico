package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author jvealuno
 */
public class Empregado extends Pessoa {
    private String cargah;
    private float salario;
    private double cartdtrab;
    private String localtrab;
    private String profissao;

    public Empregado(String cargah, float salario, double cartdtrab, String localtrab, String profissao) {
        this.cargah = cargah;
        this.salario = salario;
        this.cartdtrab = cartdtrab;
        this.localtrab = localtrab;
        this.profissao = profissao;
    }

    public Empregado(String cargah, float salario, double cartdtrab, String localtrab, String profissao, String nome, String sobrenome, int idade, double peso, double altura, Date nascimento) {
        super(nome, sobrenome, idade, peso, altura, nascimento);
        this.cargah = cargah;
        this.salario = salario;
        this.cartdtrab = cartdtrab;
        this.localtrab = localtrab;
        this.profissao = profissao;
    }

    public String getCargah() {
        return cargah;
    }

    public void setCargah(String cargah) {
        this.cargah = cargah;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public double getCartdtrab() {
        return cartdtrab;
    }

    public void setCartdtrab(double cartdtrab) {
        this.cartdtrab = cartdtrab;
    }

    public String getLocaltrab() {
        return localtrab;
    }

    public void setLocaltrab(String localtrab) {
        this.localtrab = localtrab;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
}
