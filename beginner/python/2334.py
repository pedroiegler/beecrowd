while True:
    p = int(input())
    
    if(p == -1):
        break
    else:
        if(p <= 1):
            print("0")
        else:
            print(p-1)