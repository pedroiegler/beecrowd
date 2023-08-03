op = input()

mat = [[0 for j in range(12)] for i in range(12)]

for i in range(0,12):
    for j in range(0,12):
        mat[i][j] = float(input())
        
def soma_or_media(mat, op):
    sum = 0
    cont = 0
    for i in range(0,12):
        for j in range(0,12):
            if i > j:
                sum += mat[i][j]
                cont+=1
    
    if op == 'S':
        return sum
    else:
        return sum / cont

print("%.1f" % (soma_or_media(mat,op)))