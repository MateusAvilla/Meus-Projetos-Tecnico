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
  cout<<"\n Digite um número que corresponda a um dia da semana:  ";
  cin>>n;
  switch (n)
 {
  	case 1:
	    {
  		cout<<"\n O número refere-se à domingo.";
		break;
	    } 
	    
	case 2 :
	    {
  		cout<<"\n O número refere-se à segunda-feira.";
		break;
	    } 
    
	case 3 :
	    {
  		cout<<"\n O número refere-se à terça-feira.";
		break;
	    } 
		
	case 4 :
	    {
  		cout<<"\n O número refere-se à quarta-feira.";
		break;
	    } 
		
	case 5 :
	    {
  		cout<<"\n O número refere-se à quinta-feira.";
		break;
	    } 
	
	case 6 :
	    {
  		cout<<"\n O número refere-se à sexta-feira.";
		break;
	    } 
		
	case 7 :
	    {
  		cout<<"\n O número refere-se à sábado.";
		break;
	    } 				    
  
   

   
  default: 
     {
	cout<<"\n Número digitado não corresponde a nenhum dia da semana.";
     } 
    
  }
  
  
  
  
  
  
  
  getch(); 	//ou system("pause");
  
}
