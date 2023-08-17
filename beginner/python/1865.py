n = int(input())

for i in range(0,n):
    name, numero = input().split()
    numero = int(numero)
    
    if(name == "Thor"):
        print("Y")
    else:
        print("N")
