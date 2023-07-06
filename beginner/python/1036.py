from math import sqrt

valores = input().split(' ')

a, b, c = valores

a = float(a)
b = float(b)
c = float(c)

delta = pow(b,2) - 4 * a * c

if(a == 0 or delta < 0):
    print("Impossivel calcular")
else:
    R1 = (-b + sqrt(delta)) / (2 * a)
    R2 = (-b - sqrt(delta)) / (2 * a)
    print("R1 = %.5f" % R1)
    print("R2 = %.5f" % R2)
