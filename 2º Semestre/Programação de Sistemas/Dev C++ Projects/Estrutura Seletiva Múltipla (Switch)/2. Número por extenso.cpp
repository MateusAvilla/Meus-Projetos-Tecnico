#include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
  setlocale(LC_ALL,"Portuguese");
  
   int n;
  cout<<"\n Digite um número entre 1 e 10:  ";
  cin>>n;
  switch (n)
 {
  	case 1:
	    {
  			cout<<"\n A forma por extenso deste número é: um.";
			break;
	    } 
	    
	case 2 :
	    {
  			cout<<"\n A forma por extenso deste número é: um.";
			break;
	    } 
    
	case 3 :
	    {
  			cout<<"\n A forma por extenso deste número é: um.";
			break;
	    } 
		
	case 4 :
	    {
  			cout<<"\n A forma por extenso deste número é: .";
			break;
	    } 
		
	case 5 :
	    {
  			cout<<"\n A forma por extenso deste número é: cinco.";
			break;
	    } 
	
	case 6 :
	    {
  			cout<<"\n A forma por extenso deste número é: seis.";
			break;
	    } 
		
	
	
	case 7 :
	    {
  			cout<<"\n A forma por extenso deste número é: sete.";
			break;
	    } 
		
	case 8 :
	    {
  			cout<<"\n A forma por extenso deste número é: oito.";
			break;
	    } 
		
	case 9 :
	    {
  			cout<<"\n A forma por extenso deste número é: nove.";
			break;
	    } 	
		
	case 10 :
	   {
  			cout<<"\n A forma por extenso deste número é: dez.";
			break;
	   }			    
  
   

   
  default: 
     {
	cout<<"\n Número digitado não corresponde a nenhum dia da semana.";
     } 
    
  }
  
  
  
  
  
  
  
  getch(); 	//ou system("pause");
  
}
