n1 =  int(input('Digite um valor: '))
n2 = int(input('Diigite  outro valor: '))
soma = n1 + n2
multiplicacao = n1 * n2
div =  n1 / n2
divisao = n1 // n2
expo = n1 ** n2

print(f'A soma vale {soma}, o produto vale {multiplicacao}, a divisão vale {div:.2f}') #  :.2 diz respeito a formatação, fazendo o resultado ser mostrado com apenas duas casas decimais. Para  nao quebrar linha apos o print, colocar   , end=' '  e para quebrar linha, contra  barra  n.
print(f'A divisão inteira vale {divisao} e a exponenciação vale {expo}!')
