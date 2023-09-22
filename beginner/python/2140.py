troco = [7, 12, 22, 52, 102, 15, 25, 55, 105, 30, 60, 110, 70, 120, 150, 4, 10, 20, 40, 100, 200]
possivel = 0

while True:
    n, m = list(map(int, input().split()))

    if(n == 0 and m == 0):
        break
    else:
        valor = m - n

        for i in range(0,len(troco)):
            if(valor == troco[i]):
                possivel = 1
        

        if(possivel == 1):
            print("possible")
            possivel = 0
        
        else:
            print("impossible")
    
