#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string>
#include <locale.h>
using namespace std;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	int ano;
	cout << "Insira um ano com quatro dígitos: ";
	cin >> ano;
	
	if(((ano%4)==0) && ((ano%100) !=0))
	{
		
		cout << "\n O ano é bissexto" << "\n";
		
	} 
	else if((ano%400) ==0)
	{
		cout << "\n O ano é bissexto" << "\n";
	}
	else
	{
		cout << "\n O ano não é bissexto" << "\n";
	}
	
	system ("pause");

}
