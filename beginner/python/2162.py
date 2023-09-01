def main():
    N = int(input())
    H = list(map(int, input().split()))
    padrao = 0

    if N > 2:
        for i in range(2, N):
            if (H[i - 2] > H[i - 1] and H[i - 1] < H[i]) or (H[i - 2] < H[i - 1] and H[i - 1] > H[i]):
                padrao = 1
            else:
                padrao = 0
                break
    else:
        if H[0] != H[1]:
            padrao = 1

    print(padrao)

if __name__ == "__main__":
    main()
