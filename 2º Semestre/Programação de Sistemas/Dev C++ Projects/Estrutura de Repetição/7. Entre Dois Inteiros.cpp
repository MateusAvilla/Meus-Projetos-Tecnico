#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
	int num1, num2, i;
	cout<<"\nDigite um número inteiro: ";
	cin>>num1;
	cout<<"\nDigite outro número inteiro: ";
	cin>>num2;
	
	for (i=num1+1; i<num2; i++)
	{
		cout<<"\n"<<i;
	}

getch();
}
