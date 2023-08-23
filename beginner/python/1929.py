numeros = list(map(int, input().split()))

for i in range(0, 3): 
    for j in range(i + 1, 4): 
        if numeros[i] > numeros[j]: 
            temp = numeros[i]
            numeros[i] = numeros[j]
            numeros[j] = temp

if numeros[0] + numeros[1] > numeros[2] or numeros[1] + numeros[2] > numeros[3]:
    print("S")
else:
    print("N")
