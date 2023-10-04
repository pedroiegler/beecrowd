while True:
    n1, n2 = list(map(int, input().split()))

    if(n1 == 0 & n2 == 0):
        break
    else:
        print(n1*n2)