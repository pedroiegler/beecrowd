while True:
    try:
        n = int(input())
        while n:
            i = n % 10
            n = n // 10
            print(i, end="")
        print()
    except EOFError:
        break
