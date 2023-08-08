while True:
    n = int(input())

    if n == 0:
        break

    iniMatriz = 0
    fimMatriz = n
    value = 1

    m = [[0] * n for _ in range(n)]

    for i in range(0,n):
        for j in range(0,n): 
            if i == j:
                m[i][j] = 1
            elif i < j:
                m[i][j] = j - i + 1
            else:
                m[i][j] = i - j + 1
    

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