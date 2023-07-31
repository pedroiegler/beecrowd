n = []

for i in range(0,20):
    valor = int(input())
    n.append(valor)


for i in range(0,10):
    temp = n[i]
    n[i] = n[19 - i]
    n[19 - i] = temp


for i, value in enumerate(n):
    print("N[%d] = %d" % (i, value))
