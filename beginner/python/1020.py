idade = int(input())

ano = idade / 365
resto = idade % 365
mes = resto / 30
dias = resto % 30

print("%d ano(s)\n%d mes(es)\n%d dia(s)" % (ano,mes,dias))