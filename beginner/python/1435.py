while True:
    n = int(input())

    if n == 0:
        break

    iniMatriz = 0
    fimMatriz = n
    value = 1

    m = [[0] * n for _ in range(n)]

    while fimMatriz != 0:
        for i in range(iniMatriz, fimMatriz):
            for j in range(iniMatriz, fimMatriz):
                m[i][j] = value
        
        fimMatriz -= 1
        iniMatriz += 1
        value += 1

    for i in range(n):
        rowStr = ''
        for j in range(n):
            if j == 0:
                rowStr += str(m[i][j]).rjust(3)
            else:
                rowStr += ' ' + str(m[i][j]).rjust(3)
        print(rowStr)

    print()
1