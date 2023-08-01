def print_vetor(label, vetor):
    for i, value in enumerate(vetor):
        print("%s[%d] = %d" % (label,i,value))

vetPar = []
vetImpar = []
auxPar = 0
auxImpar = 0

for i in range(0, 15):
    n = int(input())
    if n % 2 == 0:
        vetPar.append(n)
        auxPar += 1

        if auxPar == 5:
            print_vetor("par", vetPar)
            vetPar = []  
            auxPar = 0
    else:
        vetImpar.append(n)
        auxImpar += 1
        if auxImpar == 5:
            print_vetor("impar", vetImpar)
            vetImpar = []  
            auxImpar = 0

print_vetor("impar", vetImpar)
print_vetor("par", vetPar)
