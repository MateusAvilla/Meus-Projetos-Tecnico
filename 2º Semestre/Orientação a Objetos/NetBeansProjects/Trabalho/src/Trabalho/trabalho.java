
package Trabalho;
import Classes.AlunodeGraduacao;
import Classes.Administrador;
import Classes.Professor;
import Classes.AlunoDePosGraduacao;
import Classes.ExAluno;
import java.util.Date;


public class trabalho 
{

   
    public static void main(String[] args) 
    {

        
        AlunodeGraduacao ag1 = new AlunodeGraduacao("Maria", "Provas",  new Date(2010, 5, 8), new Date(2005, 5,10),
                "Matutino", "JoPe", "ADM", "Claudio", "Pereira", 22, 85.73, 1.79, new Date(1995, 6, 9), 8,
                "Unisociesc","ADM259");
        
        Administrador adm1 = new Administrador("Financeira", 25, "COT", "Sustentabilidade", "Chefe de Administração",
                "Financeiro", "COT", "Chefe", "Graduada em ADM", "Periodo Integral", "Matutino", 5000, 932.211,
                "Escola", "ADM Chefe", "Maria", "Joaquina", 25, 50.5, 1.63, new Date(1995/5/8) );
 
        Professor p1 = new Professor("Agronomia", "Contador", "História", "Mestre",  "MAT258, MAT255", "Ensino",
                "Machado De Assis",  "Contratado", "Professor", "Periodo Matutino", "Vespertino", 2500, 130.170,
                "Escola", "Prof. de História", "Jakson", "Avilla", 24, 30.1, 1.59, new Date(1996, 7, 13));
        
        AlunoDePosGraduacao apg1 = new AlunoDePosGraduacao("Avilla", "8",  new Date(2019, 5, 19), new Date(2018, 3, 9), "noite", "1160007", 
                "Vespertino", "APG779" );
    }
}