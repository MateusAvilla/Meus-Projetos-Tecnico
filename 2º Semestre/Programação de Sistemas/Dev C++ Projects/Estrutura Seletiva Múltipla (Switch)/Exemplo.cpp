 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
{
  setlocale(LC_ALL,"Portuguese");
  char letra;
  cout<<"\n Digite uma vogal: ";
  cin>>letra;
  letra = toupper(letra);
  switch (letra)
 {
  	case 'A' :{
  		cout<<"\n Vogal digitada: "<<letra;
		break;
	    } 
  
   
  {
  	case 'E' :{
  		cout<<"\n Vogal digitada: "<<letra;
		break;
	    }
  }
  
  {
  	case 'I' :{
  		cout<<"\n Vogal digitada: "<<letra;
		break;
	    }
  } 
   
  {
  	case 'O' :{
  		cout<<"\n Vogal digitada: "<<letra;
		break;
	    }
  }
   
  {
  	case 'U' :{
  		cout<<"\n Vogal digitada: "<<letra;
		break;
	    } 
  } 
   
  default: {
	cout<<"\n Caracter digitado não é uma vogal.";
  } 
    
 }
  
  
  
  
  
  
 
 	
  getch(); 	//ou system("pause");
  
}
