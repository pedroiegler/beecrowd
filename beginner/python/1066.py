contPos = 0
contNeg = 0
contPar = 0
contImpar = 0

for i in range(0,5):
        n = int(input())
        if(n > 0):
            contPos+=1
        if(n < 0):
            contNeg+=1
        if(n % 2 == 0):
            contPar+=1
        if(n % 2 != 0):
            contImpar+=1
    

print("%d valor(es) par(es)" % contPar)
print("%d valor(es) impar(es)" % contImpar)
print("%d valor(es) positivo(s)" % contPos)
print("%d valor(es) negativo(s)" % contNeg)