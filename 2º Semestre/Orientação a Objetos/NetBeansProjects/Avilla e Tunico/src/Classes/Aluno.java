
package Classes;

import java.util.Date;


public class Aluno extends Pessoa

//Método Construtor

{

    public Aluno(String matricula, String nomecurso) {
        this.matricula = matricula;
        this.nomecurso = nomecurso;
    }

    public Aluno(String matricula, 
            String nomecurso, 
            String nome, 
            String sobrenome, 
            int idade, 
            double peso, 
            double altura, 
            Date nascimento) 
            
    {
        super(nome, sobrenome, idade, peso, altura, nascimento);
        this.matricula = matricula;
        this.nomecurso = nomecurso;
    }
    
    private String matricula;
    private String nomecurso;
    
    public String getMatricula()
    {
        return this.matricula;
    }
    
    public void setMatricula (String matricula)
    {
        this.matricula = matricula;
    
    } 
    
     public String getNomeCurso()
    {
        return this.nomecurso;
    }
     
    
    public void setNomeCurso (String nomecurso)
    {
        this.nomecurso = nomecurso;
    
    }    
    
    
}
