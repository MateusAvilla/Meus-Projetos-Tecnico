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
  cout<<"\n Digite um n�mero que corresponda a um dia da semana:  ";
  cin>>n;
  switch (n)
 {
  	case 1:
	    {
  		cout<<"\n O n�mero refere-se � domingo.";
		break;
	    } 
	    
	case 2 :
	    {
  		cout<<"\n O n�mero refere-se � segunda-feira.";
		break;
	    } 
    
	case 3 :
	    {
  		cout<<"\n O n�mero refere-se � ter�a-feira.";
		break;
	    } 
		
	case 4 :
	    {
  		cout<<"\n O n�mero refere-se � quarta-feira.";
		break;
	    } 
		
	case 5 :
	    {
  		cout<<"\n O n�mero refere-se � quinta-feira.";
		break;
	    } 
	
	case 6 :
	    {
  		cout<<"\n O n�mero refere-se � sexta-feira.";
		break;
	    } 
		
	case 7 :
	    {
  		cout<<"\n O n�mero refere-se � s�bado.";
		break;
	    } 				    
  
   

   
  default: 
     {
	cout<<"\n N�mero digitado n�o corresponde a nenhum dia da semana.";
     } 
    
  }
  
  
  
  
  
  
  
  getch(); 	//ou system("pause");
  
}
