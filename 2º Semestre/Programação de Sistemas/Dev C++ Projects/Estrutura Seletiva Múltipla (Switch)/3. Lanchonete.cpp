 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
 	 setlocale(LC_ALL,"Portuguese");
  
   int  codigo, quantidade; 
   double preco;
   
   
   cout<<"\n Digite o c�digo do lanche desejado: ";
   cin>> codigo;
   
   cout<<"\n Digite a quantidade desejada: ";
   cin>> quantidade;
   
   switch (codigo)
    {
  	case 100 :
  		{
  			preco = quantidade * 1.20;
  			cout<< "\n O pre�o a ser pago ser� de R$" << preco;
  			break;
		}
 	
 	case 101 :
  		{
  			preco = quantidade * 1.30;
  			cout<< "\n O pre�o a ser pago ser� de R$" << preco;
  			break;
		}
		
    case 102 :
  		{
  		    	preco = quantidade * 1.50;
  			cout<< "\n O pre�o a ser pago ser� de R$" << preco;
  			break;
		}
		
	case 103 :
  		{
  		    	preco = quantidade * 1.20;
  			cout<< "\n O pre�o a ser pago ser� de R$" << preco;
  			break;
		}
		
	case 104 :
  		{
  		    	preco = quantidade * 1.30;
  			cout<< "\n O pre�o a ser pago ser� de R$" << preco;
  			break;
		}
		
	case 105 :
  		{
  		    	preco = quantidade * 1.00;
  			cout<< "\n O pre�o a ser pago ser� de R$" << preco;
  			break;
		}
		
 	
    }
 	
 	
 	
 	
 	 getch(); 	//ou system("pause");
 	
}
 
