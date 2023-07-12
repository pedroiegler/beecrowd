salario = float(input())

if(salario >= 0.00 and salario <= 2000.00):
    print("Isento")
elif(salario >= 2000.01 and salario <= 3000.00):
    print("R$ %.2f" % ((salario - 2000)  * 0.08))
elif(salario >= 3000.01 and salario <= 4500.00):
    print("R$ %.2f" % ((1000 * 0.08) + ((salario - 3000) * 0.18)))
else:
    print("R$ %.2f" % ((1000 * 0.08) + (1500 * 0.18)  + ((salario - 4500) * 0.28)))