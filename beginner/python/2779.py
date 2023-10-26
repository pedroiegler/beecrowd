N = int(input())
M = int(input())
album = [0] * (N + 1) 

compradas = list(map(int, input().split()))

for figurinha in compradas:
    album[figurinha] = 1  

faltam = album.count(0) 

print("%d" % faltam)
