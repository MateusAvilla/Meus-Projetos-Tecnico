print('{:=^40}'.format(' LOJAS AVILLA '))

preco = float(input('Preco das compras: R$'))

print('''
[ 1 ] à vista dinheiro/cheque
[ 2 ] à vista no cartão
[ 3 ] 2x no cartão
[ 4 ] 3x ou mais no cartão
''')

opcao = int(input('Qual é a opção deseajda? '))

if opcao == 1:
    total = preco - (preco * 10 / 100)

elif opcao == 2:
    total = preco - (preco * 5 / 100)

elif opcao == 3:
    total = preco
    parcela = total / 2

    print(f'Sua compra será parcelada em 2x de {parcela:.2f} SEM JUROS.')

elif opcao == 4:
    total = preco + (preco * 20 / 100)
    totalparcelas = int(input('Quantas parcelas? '))
    parcela = total / totalparcelas

    print(f'Sua compra será parcelada em {totalparcelas}x de R${parcela:.2f} COM JUROS.')

else:
    total = preco
    print('OPÇÃO INVÁLIDA DE PAGAMENTO. Tente novamente.')


print(f'Sua compra de R${preco:.2f} vai custar R${total:.2f} no final.')    
