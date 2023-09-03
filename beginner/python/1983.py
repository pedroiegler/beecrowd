maior = 0
matricular_maior = 0

n = int(input())

for i in range(0,n):
    valores = input().split()
    matricula = int(valores[0])
    nota = float(valores[1])

    if (nota > maior):
        maior = nota
        matricular_maior = matricula

if (maior >= 8):
    print(matricular_maior)
else:
    print("Minimum note not reached")
