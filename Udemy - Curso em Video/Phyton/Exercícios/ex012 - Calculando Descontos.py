preço = float(input('Qual é o preço do produto desejado? R$'))
desconto = preço - (preço * 10 / 100)
print(f'O produto que custava {preço}, na promoção com desconto de 10% vai custar R${desconto}')