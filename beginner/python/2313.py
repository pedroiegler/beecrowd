a, b, c = list(map(int, input().split()))

if(b + c > a and a + c > b and a + b > c):
    if (a == b and b == c):
        print("Valido-Equilatero")
    elif (a == b or b == c or a == c):
        print("Valido-Isoceles")
    else :
        print("Valido-Escaleno")
   

    if (a * a == b * b + c * c or b * b == a * a + c * c or c * c == a * a + b * b):
        print("Retangulo: S")
    else:
        print("Retangulo: N")
   
else:
    print("Invalido")      