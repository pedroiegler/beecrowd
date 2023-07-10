valores = map(int, input().split())

horaIni, horaFin = valores
cont = 0

while True:
    horaIni+=1
    cont+=1
    
    if(horaIni == 24):
        horaIni = 0
    
    if(horaIni == horaFin):
        break
    
print("O JOGO DUROU %d HORA(S)" % cont)