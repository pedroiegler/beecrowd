v = []

n = float(input())

for i in range(0,100):
    v.append(n)
    n /= 2.0


for i,value in enumerate(v):
    print("N[%d] = %.4f" % (i,value))