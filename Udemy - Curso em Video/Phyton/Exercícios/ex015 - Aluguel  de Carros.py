dias = int(input('Por quantos dias o carro ficou alugado? '))
km = float(input('Quantos Km foram rodados? '))
preço = (dias * 60) + (km * 0.15)
print(f'Total a pagar: R${preço:.2f}')