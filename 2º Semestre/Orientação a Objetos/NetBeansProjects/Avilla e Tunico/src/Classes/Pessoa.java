
package Classes;

import java.util.Date;


//****************************************************************************//

//Atributos

   public class Pessoa 
   {
       

                                    
   private String nome;             //Atributo: nome
   private String sobrenome;
   private int idade;
   private double peso;
   private double altura;
   private Date nascimento;
   private double imc;
   
 //*****************************Método Construtor*****************************// 
   
   //01
   public Pessoa()
   {
       
   }
   
   //02
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
   
   
   
 //****************************Fim Método Construtor**************************//  
   
   
 //******************************** Métodos **********************************//  
   
    public String getNome () 
    {   
       return nome; 
    }
    
 //***************************************************************************//  
    
    public void setNome (String nome) 
    {
       this.nome = nome;
    }
    
 //***************************************************************************//  
    
    public String getSobrenome () 
    {
        return sobrenome;
    }
    
 //***************************************************************************//
    
    public void setSobrenome (String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }
    
 //***************************************************************************// 
    
    public int getIdade ()
    {
        return idade;
    }
    
 //***************************************************************************//
    
    public void setIdade (int idade) 
    {
        this.idade = idade;
    }
   
 //***************************************************************************//
    
    public double getPeso ()
    {
        return peso;
    }
    
 //***************************************************************************//  
 
    public void setPeso (double peso)
    {
        this.peso = peso;
    }
 
 //***************************************************************************//
    
     public double getAltura()
    {
        return altura;
    }
     
 //***************************************************************************//    
     
      public void setAltura(double altura)
    {
        this.altura = 1.78;
    }
      
 //***************************************************************************// 
      
     public Date getNascimento ()
     {
         return nascimento;
     }
      
 //***************************************************************************// 
      
     public void setNascimento (Date nascimento)
     {
         this.nascimento = nascimento;
     }       
     
 //***************************************************************************//  
     
    public double getIMC()
    {
        setImc();     
        return imc;  
    }
    
 //***************************************************************************// 
    
    public void setImc()
    {  
        imc = (peso/(altura*altura));
    }
    
 //***************************************************************************//
    
   public void mostrarMensagens(){
   System.out.println("******************************************************");
   
//***************************************************************************//
   
   
   
   
   
   
   
   
   
 //**********************************FIM**************************************//
 
   }
}
