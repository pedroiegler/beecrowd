soma = 0
cont = 0

x = int(input())
z = int(input())

while z <= x:
    z = int(input())


while True:
    if(soma > z):
        break
    else:
        cont+=1
        soma += x
        x+=1

print(cont)