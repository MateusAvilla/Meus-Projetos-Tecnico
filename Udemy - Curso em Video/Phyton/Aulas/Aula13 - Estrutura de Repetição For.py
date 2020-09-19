# Pedindo um número e contando ele, atraves de um laço.

n = int(input('\n Digite um número: '))

for c in range(0, n+1):
    print(c)
print('\nFim do programa.')    

# Pedindo o inicio da contagem, o final e de quanto em quanto será pulado.

'''inicio = int(input('\nInício: '))
fim = int(input('Fim: '))
passos = int(input('Passo: '))

for c in range(inicio, fim+1, passos):
    print(c)
print('Fim do programa.')'''



soma = 0
for c in range(0, 4):
    n = int(input('\nDigite um valor: '))
    soma += n # ou soma = soma + n
print(f'O somatório de todos os valores foi de {soma}! ')    