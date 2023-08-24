a = int(input())
ara = list(map(int, input().split()))

c = ara[0]
e = 1

for d in range(0, a):
    if ara[d] < c:
        c = ara[d]
        e = d + 1

print(e)
