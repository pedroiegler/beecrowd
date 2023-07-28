x = int(input())

for i in range(0,x):
    soma = 0
    n = int(input())

    for j in range(1,n):
        if(n % j == 0):
            soma += j
        
    if(soma == n):
        print("%d eh perfeito" % n)
    else:
        print("%d nao eh perfeito" % n)
    