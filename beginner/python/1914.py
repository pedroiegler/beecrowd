n = int(input())

for i in range(n):
    nome1, jogada1, nome2, jogada2 = input().split()
    p1, p2 = map(int, input().split())
    
    if (p1 + p2) % 2 == 0:
        if jogada1 == "PAR": 
            print(nome1)
        else:
            print(nome2)
    else:
        if jogada1 == "IMPAR": 
            print(nome1)
        else:
            print(nome2)
