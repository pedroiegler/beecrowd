operation = input()

matrice = [[0 for j in range(12)] for i in range(12)]

for i in range(12):
    for j in range(12):
        matrice[i][j] = float(input())

def operation_in_line(mat, op):
    sum = 0
    cont = 0
    for i in range(0,12):
        for j in range(i+1,12):
            sum += mat[i][j]
            cont+=1
            
    if op == 'S':
        return sum
    else:
        return sum / cont


print("{:.1f}".format(operation_in_line(matrice, operation)))
