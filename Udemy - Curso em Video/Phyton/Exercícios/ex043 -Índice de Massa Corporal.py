peso = float(input('Qual é o seu peso? (Kg): '))
altura = float(input('Qual é a sua altura? (m): '))

imc = peso / (altura ** 2)

print(f'O IMC dessa pessoa é de {imc:.1f}!')

if imc < 18.5:
    print('Você está ABAIXO DO PESO normal.')

elif imc >= 18.5 and imc < 25:
    print('PARABÉNS, você está na faixa de PESO NORMAL.')

elif 25 <= imc < 30:
    print('Você está em SOBREPESO.')

elif 30 <= imc < 40:
    print('Você está em OBESIDADE, cuidado.')

elif imc >= 40:
    print('Você está em OBESIDADE MÓRBIDA, CUIDADO.')