operacao = input()

m = [[0 for j in range(12)] for i in range(12)]

for i in range(12):
    for j in range(12):
        m[i][j] = float(input())

def soma_or_media(mat, op):
    cont = 0
    soma = 0.0

    for i in range(0,12):
        for j in range(0,12):
            if (i < j and i > 12 - j - 1):
                soma += mat[i][j]
                cont+=1
            
    if op == 'S':
        return soma
    else:
        return soma/cont

print("%.1f" % (soma_or_media(m, operacao)))