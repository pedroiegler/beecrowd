n = int(input())

for i in range(n):
    values = input().split()
    values = [float(x) for x in values]
    weighted_average = (values[0] * 2 + values[1] * 3 + values[2] * 5) / 10
    print('{:.1f}'.format(weighted_average))
