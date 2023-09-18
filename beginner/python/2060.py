cont2 = 0
cont3 = 0
cont4 = 0
cont5 = 0

n = int(input())

values = []

values = list(map(int, input().split()))

for i in range(0,n):

    if(values[i] % 2 == 0):
        cont2+=1
    if(values[i] % 3 == 0):
        cont3+=1
    if(values[i] % 4 == 0):
        cont4+=1
    if(values[i] % 5 == 0):
        cont5+=1


print("%d Multiplo(s) de 2" % cont2)
print("%d Multiplo(s) de 3" % cont3) 
print("%d Multiplo(s) de 4" % cont4)
print("%d Multiplo(s) de 5" % cont5)