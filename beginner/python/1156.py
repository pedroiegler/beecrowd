x = 1
s = 0.0

for i in range(1,40,2):
    s = s + (i / x)
    x *= 2


print("%.2f" % s)