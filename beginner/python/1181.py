line = int(input())
operation = input()

matrice = [[0 for j in range(12)] for i in range(12)]

for i in range(12):
    for j in range(12):
        matrice[i][j] = float(input())

def operation_in_line(mat, l, op):
    sum = 0
    for j in range(12):
        sum += mat[l][j]
    if op == 'S':
        return sum
    else:
        return sum / 12

print("{:.1f}".format(operation_in_line(matrice, line, operation)))
