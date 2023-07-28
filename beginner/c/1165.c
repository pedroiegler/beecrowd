#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        int num;
        scanf("%d", &num);

        int s = 0;
        int j = 1;

        while (j <= num) {
            if (num % j == 0) {
                s = s + 1;
            }
            j = j + 1;
        }

        if (s > 2) {
            printf("%d nao eh primo\n", num);
        } else {
            printf("%d eh primo\n", num);
        }
    }

    return 0;
}
