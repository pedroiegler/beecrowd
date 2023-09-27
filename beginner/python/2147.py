resultado = 0.01

casos = int(input())

while (casos!=0):

    palavra = input()

    print("%.2f" % ((len(palavra))*resultado))

    casos-=1
