valor = float(input())

if(valor >= 0 and valor <= 400.00):
    print("Novo salario: %.2lf" % ((valor * 0.15) + valor))
    print("Reajuste ganho: %.2lf" % (valor * 0.15))
    print("Em percentual: 15 %")

elif(valor >= 400.01 and valor <= 800.00):
    print("Novo salario: %.2lf" % ((valor * 0.15) + valor))
    print("Reajuste ganho: %.2lf" % (valor * 0.15))
    print("Em percentual: 15 %")
    
elif(valor >= 800.01 and valor <= 1200.00):
    print("Novo salario: %.2lf" % ((valor * 0.10) + valor))
    print("Reajuste ganho: %.2lf" % (valor * 0.10))
    print("Em percentual: 10 %")

elif(valor >= 1200.01 and valor <= 2000.00):
    print("Novo salario: %.2lf" % ((valor * 0.07) + valor))
    print("Reajuste ganho: %.2lf" % (valor * 0.07))
    print("Em percentual: 7 %")

else:
    print("Novo salario: %.2lf" % ((valor * 0.04) + valor))
    print("Reajuste ganho: %.2lf" % (valor * 0.04))
    print("Em percentual: 4 %")