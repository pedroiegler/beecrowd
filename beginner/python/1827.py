def matrix(tamanho):
    m = [[0 for _ in range(tamanho)] for _ in range(tamanho)]

    for linha in range(tamanho):
        for coluna in range(tamanho):
            if linha == coluna:
                m[linha][coluna] = 2
            elif linha == tamanho - coluna - 1:
                m[linha][coluna] = 3
            else:
                m[linha][coluna] = 0

    inicio = tamanho // 3
    fim = tamanho - inicio

    for linha in range(inicio, fim):
        for coluna in range(inicio, fim):
            m[linha][coluna] = 1

    meio = tamanho // 2
    m[meio][meio] = 4

    for linha in range(tamanho):
        for coluna in range(tamanho):
            print(m[linha][coluna], end="")
        print()
    
    print()

def main():
    while True:
        try:
            tamanho = int(input())
            matrix(tamanho)
        except EOFError:
            break

if __name__ == "__main__":
    main()
