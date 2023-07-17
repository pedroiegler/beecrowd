contR = 0
contS = 0
contC = 0
contT = 0
mediaS = 0
mediaR = 0
mediaC = 0

n = int(input())

for i in range(n):
    values = input().split()
    quant = float(values[0])
    tipo = values[1]

    contT += quant

    if tipo == 'R':
        contR += quant
    elif tipo == 'S':
        contS += quant
    elif tipo == 'C':
        contC += quant

mediaS = (contS * 100.0) / contT
mediaR = (contR * 100.0) / contT
mediaC = (contC * 100.0) / contT

print("Total: %d cobaias" % contT)
print("Total de coelhos: %d" % contC)
print("Total de ratos: %d" % contR)
print("Total de sapos: %d" % contS)
print("Percentual de coelhos: %.2f %%" % mediaC)
print("Percentual de ratos: %.2f %%" % mediaR)
print("Percentual de sapos: %.2f %%" % mediaS)
