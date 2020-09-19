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
 	setlocale(LC_ALL, "Portuguese");
 	
 	
 	int i;
 	float vetor[4], media;
 	
 	for (i=0; i < 4; i++)
 	
 	{
 		cout << "Digite a nota " <<(i+1)<< ": ";
 		cin >> vetor[i];
	}
	
	for (i = 0; i < 4; i++)
	
	{
		cout << vetor[i] << "\n";
	}
	
	media = (vetor[0] + vetor[1] + vetor[2] + vetor[3]) /4;
	cout << "\n A sua media e: " <<media;
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 }
