n = int(input())

for i in range(1,n+1):
    val = input()
    
    a, b, c = list(map(int,input().split()))

    if(val == "eye"):
        print("Caso #%d: %d" % (i, int(0.30*a + 0.59*b + 0.11*c)))
    elif(val == "mean"):
        print("Caso #%d: %d" % (i, int((a + b + c) / 3)))
    elif(val == "max"):
        if(a > b and a > c):
            print("Caso #%d: %d" % (i, a))
        elif(b > a and b > c):
            print("Caso #%d: %d" % (i, b))
        else:
            print("Caso #%d: %d" % (i, c))
    elif(val == "min"):
        if(a < b and a < c):
            print("Caso #%d: %d" % (i, a))
        elif(b < a and b < c):
            print("Caso #%d: %d" % (i, b))
        else:
            print("Caso #%d: %d" % (i, c))
    
