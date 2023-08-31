vaNum = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
vaRom = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]

N = int(input())

i = 0
while N > 0:
    if N >= vaNum[i]:
        print(vaRom[i], end="")
        N -= vaNum[i]
    else:
        i += 1

print()
