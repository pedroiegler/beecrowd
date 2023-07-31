n = int(input())
v = list(map(int, input().split()))

menor = v[0]
posicao = 0

for i in range(0,n):
    if v[i] < menor:
        menor = v[i]
        posicao = i
    
print("Menor valor: %d" % menor)
print("Posicao: %d" % posicao)
