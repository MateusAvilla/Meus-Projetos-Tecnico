
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
	int nota;
		
	do
	{	
		cout<<"Digite uma nota de 0 a 10\n";
		cin>>nota;
		if (nota<0|(nota>10))
		{ cout<<"Nota digitada é inválida.\n";
		}
	}
	while ((nota<0)|(nota>10));
	
getch();
}
