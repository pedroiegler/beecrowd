n = int(input())

cont = 0
i = n

while True:
    if cont == 6:
        break
    elif i % 2 != 0:
        print(i)
        cont += 1
    i += 1
