cont = 0

n = int(input())

for i in range(0,n):
    soma = 0
    x, y = list(map(int, input().split()))

    while cont < y:
        if (x % 2 != 0):
            soma += x
            cont+=1
        
        x+=1

    print(soma)
    cont = 0 