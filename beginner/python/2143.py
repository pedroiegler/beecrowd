t = int(input())

while (t != 0):
    for i in range(1,t+1):
        n = int(input())
        if (n % 2 != 0):
            print((n * 2) - 1)
        else:
            print((n * 2) - 2)
    
    t = int(input())
