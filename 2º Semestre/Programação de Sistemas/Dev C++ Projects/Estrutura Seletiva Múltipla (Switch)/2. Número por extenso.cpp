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
  cout<<"\n Digite um n�mero entre 1 e 10:  ";
  cin>>n;
  switch (n)
 {
  	case 1:
	    {
  			cout<<"\n A forma por extenso deste n�mero �: um.";
			break;
	    } 
	    
	case 2 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: um.";
			break;
	    } 
    
	case 3 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: um.";
			break;
	    } 
		
	case 4 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: .";
			break;
	    } 
		
	case 5 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: cinco.";
			break;
	    } 
	
	case 6 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: seis.";
			break;
	    } 
		
	
	
	case 7 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: sete.";
			break;
	    } 
		
	case 8 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: oito.";
			break;
	    } 
		
	case 9 :
	    {
  			cout<<"\n A forma por extenso deste n�mero �: nove.";
			break;
	    } 	
		
	case 10 :
	   {
  			cout<<"\n A forma por extenso deste n�mero �: dez.";
			break;
	   }			    
  
   

   
  default: 
     {
	cout<<"\n N�mero digitado n�o corresponde a nenhum dia da semana.";
     } 
    
  }
  
  
  
  
  
  
  
  getch(); 	//ou system("pause");
  
}
