golInter = 0
golGremio = 0
resposta = 1
qtdGrenais = 0
vitoriaInter = 0
vitoriaGremio = 0
empates = 0

while resposta == 1:

    golInter, golGremio = map(int, input().split())

    qtdGrenais+=1

    if(golInter > golGremio):
        vitoriaInter+=1
    elif(golGremio > golInter):
        vitoriaGremio+=1
    elif(golInter == golGremio):
        empates+=1

    print("Novo grenal (1-sim 2-nao)")
    resposta = int(input())

print("%d grenais" % qtdGrenais)
print("Inter:%d" % vitoriaInter)
print("Gremio:%d" % vitoriaGremio)
print("Empates:%d" % empates)
if (vitoriaInter > vitoriaGremio):
    print("Inter venceu mais") 
else:
    print("Gremio venceu mais")