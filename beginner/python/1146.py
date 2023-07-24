n = 1

while n != 0:
    n = int(input())

    for x in range(1,n+1):
        if(x == n):
            print(x)
        else:
            print(x, end=" ")