operacao = input()

m = [[0 for j in range(12)] for i in range(12)]

for i in range(12):
    for j in range(12):
        m[i][j] = float(input())

def soma_or_media(mat, op):
    coluna = 7
    cont = 0
    soma = 0.0
    aux = 5

    for i in range(7,12):
        for j in range(aux, coluna):
            soma += mat[i][j]
            cont += 1
            
        coluna+=1
        aux-=1

    if op == 'S':
        return soma
    else:
        return soma/cont

print("%.1f" % (soma_or_media(m, operacao)))