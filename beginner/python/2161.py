n = int(input())
ans = 0.0

while n > 0:
    ans += 6.0
    ans = 1.0 / ans
    n -= 1

ans += 3.0
print("{:.10f}".format(ans))
