while True:
    soma = 0
    cont = 0
    x = int(input())

    if (x == 0):
        break

    while cont < 5:
        if (x % 2 == 0):
            soma += x
            cont+=1
    
        x+=1

    print(soma)
