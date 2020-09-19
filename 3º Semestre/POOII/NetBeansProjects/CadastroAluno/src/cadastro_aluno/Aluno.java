/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro_aluno;

/**
 *
 * @author Mateus
 */
public class Aluno {
    private int codigo;
    private String nome;
    private float nota1, nota2, nota3, nota4, media;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public void calculaMedia()
    {
        media = (nota1 + nota2 + nota3 + nota4) / 4;
    }    

    public String verificaAprovado()
    {
        String msg = "";
        if (media >= 7)
            {
               msg = "Aprovado";
            }
        
        else
            {
                msg = "Reprovado";
            }   
        
        return msg;
    }
    
}
