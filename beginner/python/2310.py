somaS = 0
somaS1 = 0
somaB = 0
somaB1 = 0
somaA = 0
somaA1 = 0

n = int(input())

for i in range(0, n):
    nome = input()

    s, b, a = list(map(int, input().split()))
    s1, b1, a1 = list(map(int, input().split()))

    somaS += s
    somaS1 += s1
    somaB += b
    somaB1 += b1
    somaA += a
    somaA1 += a1

pontosS = (somaS1 * 100.0) / somaS
pontosB = (somaB1 * 100.0) / somaB
pontosA = (somaA1 * 100.0) / somaA

print("Pontos de Saque: %.2f %%." % pontosS)
print("Pontos de Bloqueio: %.2f %%." % pontosB)
print("Pontos de Ataque: %.2f %%." % pontosA)
