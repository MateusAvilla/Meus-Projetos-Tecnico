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
   cout<<"\n Digite um n�mero:  ";
   cin>>n1;
   
   cout<<"\n Digite outro n�mero:  ";
   cin>>n2;
   
   cout<<"\n Escolha uma opera��o matem�tica: {+}, {-}, {*}, {/} ";
   cin>> op;
   
   switch (op)
  {
  	case '+' :
  		{
  			r = n1 + n2;
  			cout<< "\n A soma dos n�meros �: " << r;
  			break;
		}
 	
 	case '-' :
  		{
  			r = n1 - n2;
  			cout<< "\n A subtra��o dos n�meros �: " << r;
  			break;
		}
		
    case '*' :
  		{
  			r = n1 * n2;
  			cout<< "\n A multiplica��o dos n�meros �: " << r;
  			break;
		}
		
	case '/' :
  		{
  			r = n1 / n2;
  			cout<< "\n A divis�o dos n�meros �: " << r;
  			break;
		}
		

 	
 	
 	
 }
 	
 	
 	
 	
 	 getch(); 	//ou system("pause");
  
 }
 	
 	
 	
 	
 	
 	

