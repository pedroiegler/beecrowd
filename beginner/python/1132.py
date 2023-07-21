x = 0
y = 0
soma = 0

x = int(input())
y = int(input())

if(x < y):
    menor = x
    maior = y
else:
    menor = y
    maior = x


for i in range(menor,maior+1):
    if(i % 13 != 0):
        soma+=i

print("%d" % soma)