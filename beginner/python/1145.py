cont = 1
x, y = map(int, input().split())

for i in range(1,y+1):
    if(cont == x):
        print(i)
        cont = 1
    else:
        print(i, end = " ")
        cont+=1


