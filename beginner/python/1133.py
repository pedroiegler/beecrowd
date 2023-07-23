n1 = int(input())
n2 = int(input())

if(n1 > n2):
    maior = n1
    menor = n2
else:
    maior = n2
    menor = n1


menor = menor + 1

for i in range(menor,maior):
    if(i % 5 == 2 or i % 5 == 3):
       print("%d" % i)
    