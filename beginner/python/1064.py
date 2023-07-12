cont = 0
soma = 0

for i in range(0,6):
    n = float(input())
    if(n > 0):
        cont+= 1
        soma += n
    
print("%d valores positivos" % cont)
print("%.1lf" % (soma / cont))