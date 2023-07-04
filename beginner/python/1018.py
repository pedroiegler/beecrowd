n = int(input())

n100 = n / 100
n1resto = n % 100
n50 = n1resto / 50
n2resto = n1resto % 50
n20 = n2resto / 20
n3resto = n2resto % 20
n10 = n3resto / 10
n4resto = n3resto % 10
n5 = n4resto / 5
n5resto = n4resto % 5
n2 = n5resto / 2
n6resto = n5resto % 2
n1 = n6resto / 1

print('%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00' % (n, n100, n50, n20, n10, n5, n2, n1)) 