n = 1

while True:
    
    n = int(input())

    if(n == 0):
        break
        
    contM = 0
    contJ = 0

    valores = input().split()
    

    for valor in valores[:n]:
        jogada = int(valor)

        if(jogada == 0):
            contM+=1
        else:
            contJ+=1


    print("Mary won %d times and John won %d times" % (contM, contJ))
