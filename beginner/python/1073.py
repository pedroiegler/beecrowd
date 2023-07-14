n = int(input())
i = 1

for i in range(i,n+1):
    if(i % 2 == 0):
        quadrado = pow(i,2)
        print("%d^2 = %d" % (i,quadrado))
    