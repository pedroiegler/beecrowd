while True:
    soma = 0
    n, m = map(int, input().split())

    if n <= 0 or m <= 0:
        break
    else:
        menor = n if n < m else m
        maior = m if n < m else n

        for i in range(menor, maior + 1):
            print(i, end=' ')
            soma += i

        print("Sum=%d" % soma)
