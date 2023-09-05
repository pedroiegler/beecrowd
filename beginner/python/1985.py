soma = 0

n = int(input())

for i in range(1,n+1):
    valores = input().split()

    index = int(valores[0])
    value = float(valores[1])

    if(index == 1001):
        value *= 1.50
        soma += value
    elif(index == 1002):
        value *= 2.50
        soma += value
    elif(index == 1003):
        value *= 3.50
        soma += value
    elif(index == 1004):
        value *= 4.50
        soma += value
    elif(index == 1005):
        value *= 5.50
        soma += value
    
print("%.2f" % soma)