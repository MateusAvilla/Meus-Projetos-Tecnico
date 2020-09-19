 #include <stdio.h>
 #include <iostream>
 #include <conio.h>
 #include <string.h>
 #include <locale.h>
 
 
 using namespace std;
 int main()
 
 {
  setlocale(LC_ALL,"Portuguese");
  
   float num1, num2, num3, soma, media, conceito, aprovado, reprovado; //Variáveis
  
  cout << "Digite a sua primeira nota: ";
  
  cin >> num1;
  
  cout << "Digite a sua segunda nota: ";
  
  cin >> num2;
  
  cout << "Digite sua terceira nota: ";
  
  cin >> num3;
  
  soma = num1 + num2 + num3;
  
  media = soma / 3;
  
  aprovado = media >= 6;
  reprovado = media < 6;
  
  
  
  
  
  cout << "\n Suas notas são: " << num1 << " " << num2 << " " << num3;
  cout << "\n Sua media final e: " << media; 
  
  if (media>9.0 && media <= 10.0)
  {
  	cout << "\n O conceito correspondente é: A." ;
  }
  
  else if (media > 7.5 && media <= 9.0)
  {
  cout << "\n O conceito correspondente é: B." ;
  }
  
  else if (media > 6.0 && media <= 7.5)
  {
  	cout << "\n O seu conceito correspondente é: C." ;
  }
  
  else if (media > 4.0 && media <= 6.0)
  {
  	cout << "\n O seu conceito correspondente é: D." ;
  }
  
  else  if (media <= 4.0 && media >= 0.0 )
  {
  	cout << "\n O seu conceito correspondente é: E." ;
  }
  
  if (media > 6)
  {
  	cout << "\n Você está Aprovado.";
  }
 
  else if (media <= 6) 
  {
  	cout << "\n Você está Reprovado.";
  }
  
  
  
 
 	
  getch(); 	//ou system("pause");
  
 }
