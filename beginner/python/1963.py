valores = list(map(float, input().split()))

valor = valores[0]
valorNovo = valores[1]

diferenca_percentual = ((valorNovo - valor) / valor) * 100

print("%.2f%%" % diferenca_percentual)