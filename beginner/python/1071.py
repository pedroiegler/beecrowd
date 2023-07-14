soma = 0
menor = 0
maior = 0

x = int(input())
y = int(input())

if(x < y):
    menor = x
    maior = y

if(y < x):
    menor = y
    maior = x


if(menor % 2 != 0):
    for i in range(menor+1,maior):
        if(i % 2 != 0):
            soma = soma + i
        
else:
    for i in range(menor,maior):
        if(i % 2 != 0):
            soma = soma + i

print(soma)