 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
  setlocale(LC_ALL,"Portuguese");
  
  cout<< "CÊ VAI SENTA NA CABEÇA!\n";
  
  	
  int Gamer = 1;
  char letra = 'A';
  float peso = 58.3;
  cout <<"O peso do Gamer número " << Gamer <<
  " da categoria " << letra << " é de " << peso << " Kg.";
  
 
 	
  getch();
  
 }
