
package Classes;
import java.util.Date;

public class AlunodeGraduacao extends Aluno 

{
    private String prof;
    private String avaliacao;
    private Date data_acaba;
    private Date data_inicio;
    private String horario;

    public AlunodeGraduacao(String prof, String avaliacao, Date data_acaba, Date data_inicio, String horario,
    String matricula, String nomecurso, float notas, String instituicao, String turma) 
        {
        super(matricula, nomecurso, notas, instituicao, turma);
        this.prof = prof;
        this.avaliacao = avaliacao;
        this.data_acaba = data_acaba;
        this.data_inicio = data_inicio;
        this.horario = horario;
        }

    public AlunodeGraduacao(String prof, String avaliacao, Date data_acaba, Date data_inicio, String horario,
    String matricula, String nomecurso, String nome, String sobrenome, int idade, double peso, double altura,
    Date nascimento, float notas, String instituicao, String turma)
        {
        super(matricula, nomecurso, nome, sobrenome, idade, peso, altura, nascimento, notas, instituicao, turma);
        this.prof = prof;
        this.avaliacao = avaliacao;
        this.data_acaba = data_acaba;
        this.data_inicio = data_inicio;
        this.horario = horario;
        }

    public String getProf() 
    {
        return prof;
    }

    public void setProf(String prof)
    {
        this.prof = prof;
    }

    public String getAvaliacao()
    {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao)
    {
        this.avaliacao = avaliacao;
    }

    public Date getData_acaba() 
    {
        return data_acaba;
    }

    public void setData_acaba(Date data_acaba) 
    {
        this.data_acaba = data_acaba;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) 
    {
        this.data_inicio = data_inicio;
    }

    public String getHorario() 
    {
        return horario;
    }

    public void setHorario(String horario) 
    {
        this.horario = horario;
    }

  
}