
package Classes;

import java.util.Date;


public class Professor extends Pessoa
     
//Método Construtor
{
    
    private String codigo;
    private String formacao;

    public Professor(String codigo, String formacao) {
        this.codigo = codigo;
        this.formacao = formacao;
    }

    public Professor(String codigo, 
            String formacao, 
            String nome, 
            String sobrenome, 
            int idade, 
            double peso, 
            double altura, 
            Date nascimento) 
            
    {
        super(nome, sobrenome, idade, peso, altura, nascimento);
        this.codigo = codigo;
        this.formacao = formacao;
    }
    
    
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public void setCodigo (String codigo)
    {
        this.codigo = codigo;
    
    } 
    
     public String getFormacao()
    {
        return this.formacao;
    }
     
    
    public void setFormacao (String formacao)
    {
        this.formacao = formacao;
    
    }    
    
    
}
    

