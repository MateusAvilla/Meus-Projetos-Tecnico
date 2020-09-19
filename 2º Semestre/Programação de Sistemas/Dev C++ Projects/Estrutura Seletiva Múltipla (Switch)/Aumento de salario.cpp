 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
 	 setlocale(LC_ALL,"Portuguese");
  
   double A, B, C, salario;
   char plano;
   
   cout<<"\n Digite o valor do seu salário: ";
   cin>> salario;
   
   cout<<"\n Digite o seu plano de trabalho: ";
   cin>> plano;
   
   plano = toupper(plano);
   
   switch (plano)
    {
  	case 'A' :
  		{
  			salario = salario + (salario * 0.1);
  			cout<< "\n O seu novo salário será de: " << salario;
  			break;
		}
 	
 	case 'B' :
  		{
  			salario = salario + (salario * 0.2);
  			cout<< "\n O seu novo salário será de: " << salario;
  			break;
		}
		
    case 'C' :
  		{
  		    salario = salario + (salario * 0.3);
  			cout<< "\n O seu novo salário será de: " << salario;
  			break;
		}
		
 	
    }
 	
 	
 	
 	
 	 getch(); 	//ou system("pause");
 	
}
 
