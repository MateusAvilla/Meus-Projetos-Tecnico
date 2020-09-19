package exercicio_04;


public class Professor extends Pessoa 
{
    private int matricula;
    String tipo;
    private int carga_horaria;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
    
    public String verifica_tipo()
    {
        String retorno = tipo;
        
        if (carga_horaria >=50)
        {
            tipo = "Integral!";
        }
        
        else
        {
            tipo = "Convidado!";
        }    
        
        return retorno;
    }
    
    
    
    
    
    
    
    
    
    
    
}
