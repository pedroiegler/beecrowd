n = []
v = int(input())

for a in range(0,10):
    n.append(v)
    v *= 2
    
for i, value in enumerate(n):
    print("N[%d] = %d" % (i,value))

