 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string>
 #include <locale.h>
 using namespace std;
 

 int main()
 
 {
  setlocale (LC_ALL, "Portuguese");
  
  int idade;	//variavel
  cout <<"Digite a sua idade: ";
  cin >> idade;
  if (idade>=18)
  
  {
  	cout << "\n\n Sua idade e: " << idade;
  	cout << "\n Voc� � maior de idade.";
  }
  
  else
  
  {
  	cout << "\n\n Sua idade e: " << idade;
  	cout << "\n Voc� � menor de idade.";
  }
  
  
  
  
  
  
  
  
  
  
  
  
  system("pause");
  
 }
