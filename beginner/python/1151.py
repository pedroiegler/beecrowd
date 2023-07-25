x = int(input())

a, b, c = 0, 1, 0

for y in range(1, x):
    if y % 2 == 1:
        print(c, end=" ")
        c = a + b
        a = c
    elif y == 2:
        print(c, end=" ")
    elif y % 2 == 0:
        print(c, end=" ")
        c = a + b
        b = c

print(c)