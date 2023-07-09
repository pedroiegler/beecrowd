valores = map(float, input().split(' '))

a, b, c = valores


if(a < b):
    temp = a
    a = b
    b = temp

if(a < c):
    temp = a
    a = c
    c = temp

if(b < c):
    temp = b
    b = c
    c = temp


powA = pow(a,2)
powB = pow(b,2)
powC = pow(c,2)

if(a >= (b+c) or b >= (a+c) or c >= (a+b)):
    print("NAO FORMA TRIANGULO")
elif(powA == (powB + powC) or powB == (powA + powC) or powC == (powA + powB)):
    print("TRIANGULO RETANGULO")
elif(powA > (powB + powC) or powB > (powA + powC) or powC > (powA + powB)):
    print("TRIANGULO OBTUSANGULO")
elif(powA < (powB + powC) or powB < (powA + powC) or powC < (powA + powB)):
    print("TRIANGULO ACUTANGULO")
if(a == b and a == c):
    print("TRIANGULO EQUILATERO")
if((a == b and a != c) or (a == c and a != b) or (b == c and b != a)):
    print("TRIANGULO ISOSCELES")
