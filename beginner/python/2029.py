import math

while True:
    try:
        volume = float(input())
        diametro = float(input())

        raio = diametro / 2.0
        altura = volume / (math.pi * raio * raio)
        area_boca = math.pi * raio * raio

        print('ALTURA = %.2f' % altura)
        print('AREA = %.2f' % area_boca)

    except EOFError:
        break
