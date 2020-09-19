
    package Projeto01;

    import Classes.Pessoa;
import java.util.Date;
    
    public class Projeto01 {

   
    //**********************************************************************// 
    public static void main(String[] args) 
    {
        System.out.println("Fala tu mermão!");
        System.out.println("Fica com Deus");
        System.out.println("Falow");
        System.out.println("");
        System.out.println("******************************************************");
        
        
   //******************************** Objeto 1********************************//  
   
        System.out.println("");
        Pessoa pessoa01 = new Pessoa ();
        pessoa01.setNome ("Mateus");
        pessoa01.setSobrenome ("Avilla");
        pessoa01.setIdade (16);
        pessoa01.setAltura (1.78);
        pessoa01.setPeso (65.0);
        pessoa01.setNascimento (new Date(2003, 1, 11));
   
        
        System.out.println("Nome: " + pessoa01.getNome ());
        System.out.println("Sobrenome: " + pessoa01.getSobrenome( ));
        System.out.println("Idade: " + pessoa01.getIdade ());
        System.out.println("Altura: " + pessoa01.getAltura ());
        System.out.println("Peso: " + pessoa01.getAltura ());
        System.out.println("Nascimento: " + pessoa01.getNascimento ().getDate() +"/"+
                                          + pessoa01.getNascimento ().getMonth() +"/"+
                                          + pessoa01.getNascimento ().getYear() );
        
        System.out.println("IMC: " + pessoa01.getIMC() );
        
        System.out.println("");
        
        pessoa01.mostrarMensagens();
         
         
   //******************************** Fim Objeto 1****************************//
   
   
        
   //******************************** Objeto 2********************************//
   
        System.out.println("");
        
        Pessoa pessoa02 = new Pessoa ();
        pessoa02.setNome ("Tunico");
        pessoa02.setSobrenome ("Netto");
        pessoa02.setIdade (16);
        pessoa02.setAltura (1.75);
        pessoa02.setPeso (58.0);
        pessoa02.setNascimento (new Date(2003, 7,31));
   
        
        System.out.println("Nome: " + pessoa02.getNome () );
        System.out.println("Sobrenome: " + pessoa02.getSobrenome() );
        System.out.println("Idade: " + pessoa02.getIdade () );
        System.out.println("Altura: " + pessoa02.getAltura () );
        System.out.println("Peso: " + pessoa02.getAltura () );
        System.out.println("Nascimento: " + pessoa02.getNascimento ().getDate() +"/"+
                                          + (pessoa02.getNascimento ().getMonth()+1)+"/"+
                                          + pessoa02.getNascimento ().getYear() );
        
       System.out.println("IMC: " + pessoa02.getIMC() );
       
       System.out.println("");
       
       pessoa01.mostrarMensagens();
       
   
   
   //******************************* Fim Objeto 2 ****************************//
   
   
   
                                                   
  //******************************** Objeto 3 ********************************//
        
    System.out.println("");
    
        Pessoa pessoa03 = new Pessoa ( "Google",
                                "Assistente",
                                3,
                                0,
                                0.0,
                                new Date(2016, 5, 18));
    
  
        System.out.println("Nome: " + pessoa03.getNome () );
        System.out.println("Sobrenome: " + pessoa03.getSobrenome( ) );
        System.out.println("Idade: " + pessoa03.getIdade () );
        System.out.println("Altura: " + pessoa03.getAltura () );
        System.out.println("Peso: " + pessoa03.getAltura () );
        System.out.println("Nascimento: " + pessoa03.getNascimento ().getDate() +"/"+
                                          + (pessoa03.getNascimento ().getMonth()+1)+"/"+
                                          + pessoa03.getNascimento ().getYear() );
        
        
       System.out.println("IMC: " + pessoa03.getIMC() );
       
       System.out.println("");
       
       pessoa01.mostrarMensagens();
  
  //******************************* Fim Objeto 3 *****************************//
  
  //******************************** Objeto 4 ********************************//
    
        
  
  
  
  
  
  
  
  
  
  //******************************** Fim Objeto 4 ****************************//
  
   }  
        
 }