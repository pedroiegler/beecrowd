n1 = 0
n2 = 0
media = 0
nota_valida = 0

while (nota_valida != 1):
    n1 = float(input())
    if(n1 < 0.0 or n1 > 10.0):
        print("nota invalida")
    else:
        nota_valida+=1


nota_valida = 0

while (nota_valida != 1):
    n2 = float(input())
    if(n2 < 0.0 or n2 > 10.0):
        print("nota invalida")
    else:
        nota_valida+=1


media = (n1 + n2) / 2.0

print("media = %.2f" % media)