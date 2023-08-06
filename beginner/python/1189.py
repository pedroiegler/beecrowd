operacao = input()

m = [[0 for j in range(12)] for i in range(12)]

for i in range(12):
    for j in range(12):
        m[i][j] = float(input())

def soma_or_media(mat, op):
    p = 0
    cont = 0
    soma = 0.0
    r = 4

    for i in range(1,11):
        if i <= 5:
            for j in range(0,p+1):
                soma += mat[i][j]
                cont+=1
            p+=1

        elif i >= 6:
            for j in range(0,r+1):
                soma += mat[i][j]
                cont+=1
            r-=1
    


    if op == 'S':
        return soma
    else:
        return soma/cont

print("%.1f" % (soma_or_media(m, operacao)))