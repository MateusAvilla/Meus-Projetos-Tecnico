#include<stdio.h>
#include<string.h>
#include<locale.h>
#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

int main(){
	setlocale(LC_ALL,"Portuguese");
	float n1, n2, n3;
	cout << "Digite o primeiro n�mero: ";
	cin >> n1;
	cout << "\nDigite o segundo n�mero: ";
	cin >> n2;
	cout << "\nDigite o terceiro n�mero: ";
	cin >> n3;
	if(n1<n2){
		if(n1<n3){
			cout << "o menor n�mero � " << n1;
		}
	}
	else if(n2 < n1)
	{
		if(n2 < n3){
			cout << "o menor n�mero � " << n2;
		}
	
	}else{
		cout << "o menor n�mero � " << n3;
	}
	cout << "\n\n";
	system("pause");
}
