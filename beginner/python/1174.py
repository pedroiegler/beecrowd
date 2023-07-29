v = []

for i in range(0,100):
    value = float(input())
    v.append(value)


for i, value in enumerate(v):
    if(v[i] <= 10):
        print("A[%d] = %.1f" % (i,value))
    
