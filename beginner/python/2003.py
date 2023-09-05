while True:
    try:
        horario = input()
        hora, minuto = map(int, horario.split(":"))

        if 5 <= hora <= 6:
            print("Atraso maximo: 0")
        elif hora == 7:
            print("Atraso maximo:", minuto)
        elif hora == 8:
            print("Atraso maximo:", 60 + minuto)
        elif hora == 9:
            print("Atraso maximo:", 120 + minuto)
    except EOFError:
        break
