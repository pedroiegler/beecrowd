soma = 0
total = 0

while True:
    idade = int(input())
    if(idade >= 0):
        soma += idade
        total+=1
    else:
        break

media = soma / total

print("%.2f" % media)