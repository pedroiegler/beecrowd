n = int(input())

for i in range(n):
    soma = 0.0
    
    nome = input()
    num = float(input())
    
    maior = 0.0
    menor = 0.0
    
    notas_input = input()
    notas = [float(nota) for nota in notas_input.split()]

    for j in range(7):
        nota = notas[j]

        if j == 0:
            maior = nota
            menor = nota

        if nota > maior:
            maior = nota

        if nota < menor:
            menor = nota

        soma += nota

    resultado = ((soma - (maior + menor)) * num)

    print('%s %.2f' % (nome, resultado))
