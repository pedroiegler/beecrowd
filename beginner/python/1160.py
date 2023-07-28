t = int(input())

for i in range(0,t):
    cont = 0
    pa, pb, g1, g2 = list(map(float, input().split()))
    pa = int(pa)
    pb = int(pb)

    while True: 
        cont+=1
        pa += int((pa * g1) / 100)
        pb += int((pb * g2) / 100)

        if (cont > 100):
            print("Mais de 1 seculo.")
            break
        elif (pa > pb):
            print("%d anos." % cont)
            break

