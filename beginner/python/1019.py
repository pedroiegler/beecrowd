tempo = int(input())

hora = tempo / 3600
resto = tempo % 3600

minutos = resto / 60
segundos = resto % 60

print("%d:%d:%d" % (hora,minutos,segundos))