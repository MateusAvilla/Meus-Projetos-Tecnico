#include<stdio.h>
#include<string.h>
#include<locale.h>
#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;


int sala();

int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade1, idade2, idade3;
	float media;
	string resultado;
	
	cout << "Informe a idade do primeiro aluno: ";
	cin >> idade1;
	cout << "\nInforme a idade do segundo aluno: ";
	cin >> idade2;
	cout << "\nInforme a idade do terceiro aluno: ";
	cin >> idade3;
	media = (idade1+idade2+idade3)/3;
	if( media < 25){
		resultado="Turma jovem";
	}else if(media >=25 && media <40){
		resultado = "Turma Adulta";
	}
	else if(media >40){
		resultado = "Turma Idosa";
	}
	cout << resultado;
	//cout << "\n" << media;
		
	
	
	cout << "\n\n";
	system("pause");
	
	
}

