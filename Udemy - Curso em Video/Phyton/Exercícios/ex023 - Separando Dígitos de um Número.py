num = int(input('Informe um número: '))
uni = num // 1 % 10
dez = num // 10 % 10
cen = num // 100 % 10
mil = num // 1000 % 10
print(f'Analisando o número {num}')
print(f'Unidades: {uni}')
print(f'Dezenas: {dez}')
print(f'Centenas: {cen}')
print(f'Milhar: {mil}')