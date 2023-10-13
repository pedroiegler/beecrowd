while True:
    T = int(input())
    if T == 0:
        break

    soma = 0

    for _ in range(T):
        N, alimento = input().split(maxsplit=1)
        N = int(N)
        alimento = alimento.strip().lower()

        quantidadeVitaminaC = 0
        if alimento == "suco de laranja":
            quantidadeVitaminaC = 120
        elif alimento == "morango fresco":
            quantidadeVitaminaC = 85
        elif alimento == "mamao":
            quantidadeVitaminaC = 85
        elif alimento == "goiaba vermelha":
            quantidadeVitaminaC = 70
        elif alimento == "manga":
            quantidadeVitaminaC = 56
        elif alimento == "laranja":
            quantidadeVitaminaC = 50
        elif alimento == "brocolis":
            quantidadeVitaminaC = 34

        soma += N * quantidadeVitaminaC

    if 110 <= soma <= 130:
        print(str(soma) + " mg")
    elif soma > 130:
        print("Menos " + str(soma - 130) + " mg")
    else:
        print("Mais " + str(110 - soma) + " mg")
