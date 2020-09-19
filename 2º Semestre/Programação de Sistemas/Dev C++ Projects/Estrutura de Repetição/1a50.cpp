//Programa que imprime números ímpares entre 1 e 50.cpp
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
		int i, result = 0;
		
	for (i=1; i<=50; i++)
	{	if(i%2 !=0)	
		{
			cout<<"\n"<<i;
		}
	
	}

getch();
}
