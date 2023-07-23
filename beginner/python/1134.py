tipo = 0
contAlcool = 0
contDiesel = 0
contGasolina = 0

while tipo != 4:
    tipo = int(input())

    if(tipo == 1):
        contAlcool+=1
    elif(tipo == 2):
        contGasolina+=1
    elif(tipo == 3):
        contDiesel+=1


print("MUITO OBRIGADO")
print("Alcool: %d" %  contAlcool)
print("Gasolina: %d" % contGasolina)
print("Diesel: %d" % contDiesel)