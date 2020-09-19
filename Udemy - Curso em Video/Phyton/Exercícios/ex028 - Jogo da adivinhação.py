from random import randint
from time import sleep
computador = randint(0, 5) 

print('*' * 80)
print('Vou "pensar" em um número entre 0 e 5. Tente adivinhar... ')
print('*' * 80)

jogador = int(input('Em que número pensei? '))
print('PROCESSANDO...')
sleep(1)


if jogador == computador:
    print('PARABÉNS! Você conseguiu adivinhar o número que pensei.')

else:
    print(f'GANHEI! Eu pensei no número {computador} e não no número {jogador}')
    