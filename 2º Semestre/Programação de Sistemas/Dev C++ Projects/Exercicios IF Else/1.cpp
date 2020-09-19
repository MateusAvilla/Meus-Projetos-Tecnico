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
  
  cout << "Digite uma medida em pés:  ";
  
  cin >> pes;
  
  polegadas = pes * 12;
  jarda = pes / 3;
  milha = jarda / 1760;
  
  cout << "\n A medida em polegadas é: " <<polegadas;
  cout << "\n A medida em jardas é: " <<jarda;
  cout << "\n A medida em milhas é: " <<milha;
  

  
   
  
  
  
 
 	
  getch(); 	//ou system("pause");
  
 }
