n = int(input())
for i in range(1, n+1):
    valores = input().split()
    p1 = valores[0]
    p2 = valores[1]

    if p1 == 'tesoura':
        if p2 == 'pedra' or p2 == 'Spock':
            print("Caso #{}: Raj trapaceou!".format(i))
        elif p2 == 'papel' or p2 == 'lagarto':
            print("Caso #{}: Bazinga!".format(i))
        elif p2 == 'tesoura':
            print("Caso #{}: De novo!".format(i))

    elif p1 == 'pedra':
        if p2 == 'Spock' or p2 == 'papel':
            print("Caso #{}: Raj trapaceou!".format(i))
        elif p2 == 'tesoura' or p2 == 'lagarto':
            print("Caso #{}: Bazinga!".format(i))
        elif p2 == 'pedra':
            print("Caso #{}: De novo!".format(i))

    elif p1 == 'papel':
        if p2 == 'pedra' or p2 == 'Spock':
            print("Caso #{}: Bazinga!".format(i))
        elif p2 == 'tesoura' or p2 == 'lagarto':
            print("Caso #{}: Raj trapaceou!".format(i))
        elif p2 == 'papel':
            print("Caso #{}: De novo!".format(i))

    elif p1 == 'Spock':
        if p2 == 'pedra' or p2 == 'tesoura':
            print("Caso #{}: Bazinga!".format(i))
        elif p2 == 'lagarto' or p2 == 'papel':
            print("Caso #{}: Raj trapaceou!".format(i))
        elif p2 == 'Spock':
            print("Caso #{}: De novo!".format(i))

    elif p1 == 'lagarto':
        if p2 == 'pedra' or p2 == 'tesoura':
            print("Caso #{}: Raj trapaceou!".format(i))
        elif p2 == 'Spock' or p2 == 'papel':
            print("Caso #{}: Bazinga!".format(i))
        elif p2 == 'lagarto':
            print("Caso #{}: De novo!".format(i))
