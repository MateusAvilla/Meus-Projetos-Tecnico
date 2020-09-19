#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
		float i, result;
			
		for (i=1; i<51; i++)
		{
			result =1.99*i;
			cout<<"\n Lojas Quase Dois - Tabela de Preço. ";
			cout<<i<<"- R$"<<result;
		}

getch();
}
