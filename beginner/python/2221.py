n = int(input())

for i in range(0,n):
    bonus = int(input())
    
    at1, df1, lvl1 = list(map(int, input().split()))
    at2, df2, lvl2 = list(map(int, input().split()))

    golpe1 = ((at1 + df1) / 2)
    golpe2 = ((at2 + df2) / 2)

    if(lvl1 % 2 == 0):
        golpe1 += bonus
    if(lvl2 % 2 == 0):
        golpe2 += bonus

    if(golpe1 > golpe2):
        print("Dabriel")
    elif(golpe2 > golpe1):
        print("Guarte")
    else:
        print("Empate")