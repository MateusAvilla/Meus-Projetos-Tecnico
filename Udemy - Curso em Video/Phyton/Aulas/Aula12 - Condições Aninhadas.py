nome = str(input('Qual é o seu nome? '))

# Podem ser usados quantos elifs ou else if eu quiser, desde que tenha um if.

if nome == 'mateus':
    print('Que nome TOP!')

elif nome == 'pedro' or nome == 'maria' or nome == 'paulo':
    print('Seu nome é bem popular no Brasil.')

elif nome in 'ana claudia jessica juliana':
    print('Belo nome feminino.')

else:
     print('Seu nome é bem normal!')   

print(f'Tenha um bom dia, {nome}!')