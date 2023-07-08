valores = map(float, input().split())

a, b, c = valores

x = a
y = b
z = c

if(x > y):
    temp = x
    x = y
    y = temp
    
if(x > z):
    temp = x
    x = z
    z = temp

if(y > z):
    temp = y
    y = z
    z = temp

print("%d\n%d\n%d" % (x,y,z))
print("\n%d\n%d\n%d" % (a,b,c))