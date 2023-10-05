mensagem = input()
contador = 0

for c in mensagem:
    if c == '1':
        contador += 1

if (contador % 2 == 0):
    mensagem += "0"
else:
    mensagem += "1"

print(mensagem)
