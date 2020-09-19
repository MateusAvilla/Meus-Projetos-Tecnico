#include <iostream>
#include <locale.h> 
using namespace std;
int main( ) 
{ 
	setlocale(LC_ALL,"Portuguese"); 
	int contador, cont_nt,total_alunos, n_alunos, n_notas; 
	float notas [4][3] ,soma_notas=0, media=0, media_cd_aluno=0;
	cout <<"\n\n"; 
	cout <<" ______________________________________________ \n"; 
	cout <<" ~~ PROGRAMA NOTAS~~ \n"; 
	cout << "Usando MATRIZ \n"; 
	cout <<" ______________________________________________ \n";
	cout <<"\n\n"; // lendo as NOTAS 
	cout <<" Informe 3 notas para cada aluno: \n";
	for ( contador=0; contador<4; contador++)
	{
		cout <<"\n " <<contador+1 <<"o Aluno: "; 
		for (cont_nt=0; cont_nt<3; cont_nt++)
		{
			cout << "\n Informe a "<< cont_nt+1 <<"a Nota do "<< contador <<"o aluno: ";
			cin >> notas[contador][cont_nt]; 
			// acumular notas
			soma_notas=soma_notas + notas[contador][cont_nt]; 
			total_alunos = total_alunos + 1;
		}
	}
	//Calculando a média das notas 
	media = soma_notas / total_alunos;
	// Imprimindo a média 
	cout<<"\n\n Média das Notas: "<< media<< "\n";
	// imprimindo as Médias de Cada Aluno 
	cout<<" Imprimindo a Média de cada aluno: \n"; 
	for (contador = 0; contador < 4; contador++)
	{
		cout <<"\n Média do " << contador+1 <<"o Aluno: "; 
		for (cont_nt = 0; cont_nt < 3; cont_nt++)
		{
			// acumular notas
			media_cd_aluno= media_cd_aluno + notas[contador][cont_nt];
			
		}
		cout << media_cd_aluno / 3;
		media_cd_aluno = 0;
		
	}
	cout<<"\n\n\n"; 
	system("pause"); 
}

