valores = input().split(" ")

a, b, c = valores

a = int(a)
b = int(b)
c = int(c)

if(a > b and a > c):
    print("%d eh o maior" % a)
elif(b > c):
    print("%d eh o maior" % b)
else:
    print("%d eh o maior" % c)