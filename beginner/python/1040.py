valores = input().split()

n1, n2, n3, n4 = valores

n1 = float(n1)
n2 = float(n2)
n3 = float(n3)
n4 = float(n4)

media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0

print("Media: %.1f" % media)

if(media >= 7.0):
    print("Aluno aprovado.")
elif(media < 5.0):
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    exame = input()
    exame = float(exame)
    print("Nota do exame: %.1f" % exame)
    media = (exame + media) / 2
    if(media >= 5.0):
        print("Aluno aprovado.")
        print("Media final: %.1f" % media)
    else:
        print("Aluno reprovado.")
        print("Media final: %.1f" % media)
    