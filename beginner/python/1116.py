n = int(input())

for i in range(0, n):
    x, y = map(int, input().split())

    if y == 0:
        print("divisao impossivel")
    else:
        result = x / y
        print("%.1f" % result)
