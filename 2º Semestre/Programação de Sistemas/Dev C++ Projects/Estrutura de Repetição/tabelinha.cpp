#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
	float preco, result;
	int i;
	cout<<"Qual o pre�o do p�o?\n";
	cin>>preco;
	 
	for (i=1; i<51;i++)
	{
		result=preco*i;
		cout<<"\nPanificadora - pre�os.  ";
		cout<<i<<"   R$"<<result;
	}
getch();
}
