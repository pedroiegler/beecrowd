while True:
    try:
        N = int(input())
        votos = input().split()
        votos_favoraveis = sum(map(int, votos[:N]))

        if votos_favoraveis * 3 >= 2 * N:
            print("impeachment")
        else:
            print("acusacao arquivada")
    except EOFError:
        break
