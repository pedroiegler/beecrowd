import math

n = int(input())

result1 = n / math.log(n)
result2 = 1.25506 * (n / math.log(n))

print('%.1f %.1f' % (result1, result2))
