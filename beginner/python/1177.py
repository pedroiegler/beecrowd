aux = 0
v = []

n = int(input())

for i in range(0,1000):
    v.append(aux)
    aux+=1
    if aux == n:
        aux = 0
    

for i in range(0,1000):
    print("N[%d] = %d" % (i, v[i]))
