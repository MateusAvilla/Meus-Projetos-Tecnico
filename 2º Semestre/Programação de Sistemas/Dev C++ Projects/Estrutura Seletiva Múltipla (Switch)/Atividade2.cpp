 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
  setlocale(LC_ALL,"Portuguese");
  
   double n1, n2, r;
   char op;
   cout<<"\n Digite um número:  ";
   cin>>n1;
   
   cout<<"\n Digite outro número:  ";
   cin>>n2;
   
   cout<<"\n Escolha uma operação matemática: {+}, {-}, {*}, {/} ";
   cin>> op;
   
   switch (op)
  {
  	case '+' :
  		{
  			r = n1 + n2;
  			cout<< "\n A soma dos números é: " << r;
  			break;
		}
 	
 	case '-' :
  		{
  			r = n1 - n2;
  			cout<< "\n A subtração dos números é: " << r;
  			break;
		}
		
    case '*' :
  		{
  			r = n1 * n2;
  			cout<< "\n A multiplicação dos números é: " << r;
  			break;
		}
		
	case '/' :
  		{
  			r = n1 / n2;
  			cout<< "\n A divisão dos números é: " << r;
  			break;
		}
		

 	
 	
 	
 }
 	
 	
 	
 	
 	 getch(); 	//ou system("pause");
  
 }
 	
 	
 	
 	
 	
 	

