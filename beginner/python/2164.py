import math

n = int(input())

result = (pow((((1 + math.sqrt(5)) / 2)),n) - pow((((1 - math.sqrt(5)) / 2)),n)) / math.sqrt(5)

print("%.1f" % result)