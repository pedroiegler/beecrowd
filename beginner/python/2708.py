cont1 = 0
cont2 = 0

while True:

    valores = input().split()
    action = valores[0]

    if(valores[0] == "ABEND"):
        break
    else:
        n = int(valores[1])

        if(valores[0] == "SALIDA"):
            cont1+=n
            cont2+=1
        else:
            cont1-=n
            cont2-=1


print("%d\n%d" % (cont1, cont2))