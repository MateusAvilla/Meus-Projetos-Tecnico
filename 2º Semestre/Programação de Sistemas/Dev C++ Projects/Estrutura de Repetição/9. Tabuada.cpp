#include <time.h>
#include <stdlib.h>
#include <iostream>
#include <stdio.h>
#include <string.h>
#include <locale.h>

 using namespace std;

 int main()
 
 {
	int i, resultado, num1;
	
	cout << "Digite o numero da tabuada: ";
	cin >> num1;
	
	for(i; i <= 10; i ++)
	
	{
		resultado = num1 * i;
		cout << "\n  "  << resultado;
	}
 }
