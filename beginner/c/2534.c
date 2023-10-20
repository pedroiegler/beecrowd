#include <stdio.h>

void bubbleSort(int arr[], int n) {
    int temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    int n, q, position;

    while(scanf("%d %d", &n, &q) != EOF){

        int numbers[n];

        for (int i = 0; i < n; i++) {
            scanf("%d", &numbers[i]);
        }

        bubbleSort(numbers, n);

        for (int i = 0; i < q; i++) {
            scanf("%d", &position);

            printf("%d\n", numbers[position-1]);
        }
    }

    return 0;
}
