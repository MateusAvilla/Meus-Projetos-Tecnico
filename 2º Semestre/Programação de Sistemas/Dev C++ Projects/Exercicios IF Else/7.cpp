#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string>
#include <locale.h>
using namespace std;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	char resp1, resp2, resp3, resp4, resp5;
	int n_sim;
	
	cout << "Telefonou para a v�tima? [s] [n]";
	cin >> resp1;
	if(resp1 == 's')
	{
		n_sim = n_sim +1;
	}
	
	cout << "Esteve no local do crime? [s] [n]";
	cin >> resp2;
	if(resp2 == 's')
	{
		n_sim = n_sim +1;
	}
	cout << "Mora perto da v�tima? [s] [n]";
	cin >> resp3;
	if(resp3 == 's')
	{
		n_sim = n_sim +1;

	}
	cout << "Devia para a v�tima? [s] [n]";
	cin >> resp4;
	if(resp4 == 's')
	{
		n_sim = n_sim +1;

	}
	cout << "J� trabalhou com a v�tima? [s] [n]";
	cin >> resp5;
	if(resp5 == 's')
	{
		n_sim = n_sim +1;

	}
	
	if(n_sim == 2)
	{
		cout << "O individuo � suspeito \n";
	}
	
	if(n_sim == 3 || n_sim == 4)
	{
		
	cout << "O individuo � cumplice \n";
	
	}
	
	if(n_sim == 5)
	{
		
	cout << "O individuo � assassino \n";
	
	}
	
	if(n_sim == 0 || n_sim == 1)
	{
		cout << "O individuo � inocente \n";
	}
	system("pause");

}
