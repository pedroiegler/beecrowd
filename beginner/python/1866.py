n = int(input())

for i in range(0,n):

    soma = 0

    v = int(input())

    for j in range(1,v+1):
        if(j % 2 != 0):
            soma += 1
        else:
            soma -= 1
        
    print(soma)
