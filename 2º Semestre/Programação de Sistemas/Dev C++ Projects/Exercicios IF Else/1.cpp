 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 
 using namespace std;
 int main()
 
 {
  setlocale(LC_ALL,"Portuguese");
  //Variaveis
  
  float pes, jarda, milha, polegadas;
  
  cout << "Digite uma medida em p�s:  ";
  
  cin >> pes;
  
  polegadas = pes * 12;
  jarda = pes / 3;
  milha = jarda / 1760;
  
  cout << "\n A medida em polegadas �: " <<polegadas;
  cout << "\n A medida em jardas �: " <<jarda;
  cout << "\n A medida em milhas �: " <<milha;
  

  
   
  
  
  
 
 	
  getch(); 	//ou system("pause");
  
 }
