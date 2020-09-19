
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string.h>
#include <locale.h>

using namespace std;
int main()
{
		setlocale(LC_ALL, "Portuguese");
	int x=37, y=38, z=1, i, n=37;
	float result;
	
	
	for(i=1;i<=n;i++)
	{
	result=(x*y)/z;
      cout << "\n(" << x << "*" << y << ")/" << z << "="<<result ;
      z++;
      x -= 1;                
      y -= 1;
      }

getch();
}
