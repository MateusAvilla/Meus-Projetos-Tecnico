
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
	int nalunos, nturma, x, result=0,i;
	float media;
	cout<<"Digite o número de turmas: ";
	cin>>nturma;
	
	for (i=1; i<=nturma; i++)
	{	cout<<"\nDigite o número de alunos em uma turma. ";
		cin>>x;
		result = result+x;
	}
	
	media = (result/nturma);
	cout<<"A média de alunos por turma é: "<<media;

getch();
}
