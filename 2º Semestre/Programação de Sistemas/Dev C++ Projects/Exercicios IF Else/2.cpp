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
	cout << "Digite a quantidade de ração em gramas: ";
	cin >> racao;
	
	cout << "Digite a quantidade de ração fornecida para cada gato, em gramas: ";
	cin >> rgato;
	
	cout << "\n A quantidade de ração dada para cada gato será de: " << rgato;
	
	rsobra = racao - (rgato * 2 * 5);
	
	cout << "\n A quantidade de ração gasta em 5 dias é de: " << rsobra << "\n";
	
	system("pause");
}
