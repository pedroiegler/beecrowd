atendidos = list(map(int, input().split()))
requisitados = list(map(int, input().split()))

nao_atendidos = 0

for i in range(3):
    if(requisitados[i] > atendidos[i]):
        nao_atendidos += requisitados[i] - atendidos[i]
        
print(nao_atendidos)