cont = 0
    
n = int(input())
valores = input().split()

for i in range(0,5):
    if(int(valores[i]) == n):
        cont+=1

print(cont)