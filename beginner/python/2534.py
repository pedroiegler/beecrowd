def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - 1 - i):
            if arr[j] < arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

while True:
    try:
        n, q = map(int, input().split())
        numbers = list(map(int, input().split()))

        bubble_sort(numbers)

        for i in range(q):
            position = int(input())
            if 1 <= position <= n:
                print(numbers[position - 1])
            else:
                print("Posição inválida")

    except EOFError:
        break
