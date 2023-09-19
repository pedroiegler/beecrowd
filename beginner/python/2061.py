n, m = list(map(int, input().split()))

for i in range(0,m):
    s = input()

    if(s == "fechou"):
        n+=1
    else:
        n-=1
 
print(n)