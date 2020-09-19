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
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double peso;
    private double altura;
    private Date nascimento;
    
    //Metodo contrutor
    
    public Pessoa(){}
    
    public Pessoa(String nome, 
            String sobrenome, 
            int idade, 
            double peso, 
            double altura, 
            Date nascimento)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nascimento = nascimento;
    }
    
    //Metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String x) {
        this.nome = x;
    }
        public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String y) {
        this.sobrenome = y;
    }
        public int getIdade() {
        return idade;
    }
    public void setIdade(int z) {
        this.idade = z;
    }
        public double getPeso() {
        return peso;
    }
    public void setPeso(double a) {
        this.peso = a;
    }
        public double getAltura() {
        return altura;
    }
    public void setAltura(double b) {
        this.altura = b;
    }
        public Date getDn() {
        return nascimento;
        }
    public void setDn(Date c) {
        this.nascimento = c;
    }

    public double getIMC() {
        double imc;
        imc = (peso / (altura * altura));
        return imc;
    }
}

