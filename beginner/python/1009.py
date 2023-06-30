nome = str(input())
salarioFixo = float(input())
totalVendas = float(input())

valorGanho = salarioFixo + (totalVendas * 0.15)

print("TOTAL = R$ {:.2f}".format(valorGanho))