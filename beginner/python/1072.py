contIn = 0
contOut = 0
i = 0

n = int(input())

for i in range(i,n):
    x = int(input())

    if(x >= 10 and x <= 20):
        contIn+=1
    else:
        contOut+=1
    

print("%d in" % contIn)
print("%d out" % contOut)