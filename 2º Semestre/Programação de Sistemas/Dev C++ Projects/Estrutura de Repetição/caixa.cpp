
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
	float valor, dinheiro, soma=0;
	
	do 
	{
		cout<<"Digite o valor do produto ou 0 para parar.\n";
		cin>>valor;
		soma=soma+valor;	
	}
	while (valor!=0);
	cout<<"O valor total da compra é: "<<soma<<"\nValor em dinheiro: ";
	cin>>dinheiro;
	cout<<"O troco a ser dado é: "<<dinheiro-soma;
	

getch();
}
