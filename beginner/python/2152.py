n = int(input())

for _ in range(n):
    h, m, o = map(int, input().split())
    
    if h < 10 and m < 10:
        if o == 1:
            print("0%d:0%d - A porta abriu!" % (h, m))
        else:
            print("0%d:0%d - A porta fechou!" % (h, m))
    elif h < 10 and m >= 10:
        if o == 1:
            print("0%d:%d - A porta abriu!" % (h, m))
        else:
            print("0%d:%d - A porta fechou!" % (h, m))
    elif h >= 10 and m < 10:
        if o == 1:
            print("%d:0%d - A porta abriu!" % (h, m))
        else:
            print("%d:0%d - A porta fechou!" % (h, m))
    elif h >= 10 and m >= 10:
        if o == 1:
            print("%d:%d - A porta abriu!" % (h, m))
        else:
            print("%d:%d - A porta fechou!" % (h, m))
