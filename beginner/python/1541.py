import math

while True:
    A, B, C = list(map(float, input().split()))
    
    if(A == 0):
        break

    X = math.sqrt((((A * B) / C) * 100.0))
    print("%d" % int(X))
