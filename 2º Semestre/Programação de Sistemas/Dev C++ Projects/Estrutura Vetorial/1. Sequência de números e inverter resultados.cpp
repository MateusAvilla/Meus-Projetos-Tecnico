 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 #include <time.h>
 
 //VETORES
 
 using namespace std;
 int main()
 
 {
 	int i;
 	int vetor[10];
 	
 	for(i = 0; i < 10; i++)
 	{
 		cout << " Digite o numero " <<(i+1)<< " da sequencia";
 		cin >> vetor[i];
	 }
	 
	for (i = 9; i >= 0; i--)
	{
		cout << vetor[i] << " ";
	}
  
 	
  cout << "\n\n\n";
  system("PAUSE");
  
 }
