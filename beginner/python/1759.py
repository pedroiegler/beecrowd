str = ''

n = int(input())

for i in range(1,n+1):
    if(i == n):
      str += 'Ho!'
    else:
      str += 'Ho '


print(str)