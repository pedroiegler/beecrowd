x = []

for i in range(0,10):
    value = int(input())

    if value <= 0:
        value = 1
    
    x.append(value)
    
for i, value in enumerate(x):
        print("X[%d] = %d" % (i,value))

