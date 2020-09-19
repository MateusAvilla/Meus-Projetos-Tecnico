soma = 0    # Utilizando acumuladores. 
cont = 0    # Utilizando um contador.

for c in range(1, 501, 2):  # Contando todos os numeros impares de 1 ate 500
    if c % 3 == 0:          # Se o numero for divisivel por 3, mostrar.
        cont += 1   # Ou cont = cont + 1 / Conta os números que forem utilizados. Ao fim, foram contados 83 valores, pois estes obedeceram as condições estabelecidas.      
        soma += c   # Ou soma = soma + c / Mostra a soma de todos os numeros impares multiplos de 3.

print(f'A soma de todos os {cont} valores solicitados é: {soma}')

