package Classes;


import java.util.Date;

public class Aluno extends Pessoa {
    private String matricula;
    private String nomecurso;
    private float notas;
    private String instituicao;
    private String turma;
    
    public Aluno(String matricula, String nomecurso, float notas, String instituicao, String turma){
        this.matricula = matricula;
        this.nomecurso = nomecurso;
        this.notas = notas;
        this.instituicao = instituicao;
        this.turma = turma;
    }
    
    public Aluno( 
            String matricula,
            String nomecurso,
            String nome,
            String sobrenome,
            int idade,
            double peso,
            double altura,
            Date nascimento,
            float notas,
            String instituicao,
            String turma)
    {
        super(nome, sobrenome, idade, peso, altura, nascimento);
    }
            
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
    public float getNotas()
    {
        return this.notas;
    }
    public void setNotas (float notas)
    {
        this.notas = notas;
    }
    public String getInstituicao()
    {
        return this.instituicao;
    }
    public void setInstituicao (String instituicao)
    {
        this.instituicao = instituicao;
    }
    public String getTurma()
    {
        return this.turma;
    }
    public void setTurma (String turma)
    {
        this.turma = turma;
    }
    
}


    

