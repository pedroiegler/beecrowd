maior = 0
menor = 0
i = 0

n = int(input())

for i in range(i,n+1):
    soma = 0
    n1, n2 = map(int, input().split())

    if(n1 < n2):
        menor = n1 + 1
        maior = n2
    else:
        menor = n2 + 1
        maior = n1

    for j in range(menor,maior):
        if(j % 2 != 0):
            soma += j

    print("%d" % soma)