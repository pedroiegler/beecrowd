while True:
    try:    
        n, nn, nm = list(map(int, input().split()))

        cont = 0
        for i in range(n):
            x = int(input())
            if (x >= nn and x <= nm):
                cont+=1

        print(cont)
    except EOFError:
        break