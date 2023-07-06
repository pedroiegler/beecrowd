valorInformado = float(input())
valor = 0

print("NOTAS:")

valor = (int) (valorInformado / 100)
print("%d nota(s) de R$ 100.00" % valor)
valorInformado = valorInformado % 100

valor = (int) (valorInformado / 50)
print("%d nota(s) de R$ 50.00" % valor)
valorInformado = valorInformado % 50

valor = (int) (valorInformado / 20)
print("%d nota(s) de R$ 20.00" % valor)
valorInformado = valorInformado % 20

valor = (int) (valorInformado / 10)
print("%d nota(s) de R$ 10.00" % valor)
valorInformado = valorInformado % 10

valor = (int) (valorInformado / 5)
print("%d nota(s) de R$ 5.00" % valor)
valorInformado = valorInformado % 5

valor = (int) (valorInformado / 2)
print("%d nota(s) de R$ 2.00" % valor)
valorInformado = valorInformado % 2

valorInformado *= 100
print("MOEDAS:")

valor = (int) (valorInformado / 100)
print("%d moeda(s) de R$ 1.00" % valor)
valorInformado = valorInformado % 100

valor = (int) (valorInformado / 50)
print("%d moeda(s) de R$ 0.50" % valor)
valorInformado = valorInformado % 50

valor = (int) (valorInformado / 25)
print("%d moeda(s) de R$ 0.25" % valor)
valorInformado = valorInformado % 25

valor = (int) (valorInformado / 10)
print("%d moeda(s) de R$ 0.10" % valor)
valorInformado = valorInformado % 10

valor = (int) (valorInformado / 5)
print("%d moeda(s) de R$ 0.05" % valor)
valorInformado = valorInformado % 5

valor = (int) (valorInformado / 1)
print("%d moeda(s) de R$ 0.01" % valor)
valorInformado = valorInformado % 1


