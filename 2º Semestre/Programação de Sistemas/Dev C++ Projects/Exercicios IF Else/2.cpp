#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string>
#include <locale.h>
using namespace std;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	double racao, rgato, rsobra;
	cout << "Digite a quantidade de ra��o em gramas: ";
	cin >> racao;
	
	cout << "Digite a quantidade de ra��o fornecida para cada gato, em gramas: ";
	cin >> rgato;
	
	cout << "\n A quantidade de ra��o dada para cada gato ser� de: " << rgato;
	
	rsobra = racao - (rgato * 2 * 5);
	
	cout << "\n A quantidade de ra��o gasta em 5 dias � de: " << rsobra << "\n";
	
	system("pause");
}
