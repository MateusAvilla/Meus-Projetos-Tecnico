 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
  setlocale(LC_ALL,"Portuguese");
  
  cout<< "C� VAI SENTA NA CABE�A!\n";
  
  	
  int Gamer = 1;
  char letra = 'A';
  float peso = 58.3;
  cout <<"O peso do Gamer n�mero " << Gamer <<
  " da categoria " << letra << " � de " << peso << " Kg.";
  
 
 	
  getch();
  
 }
