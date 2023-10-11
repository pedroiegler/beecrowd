#include <stdio.h>
#include <stdbool.h>

int main() {
    int p;
    while (true) {
        scanf("%d", &p);

        if (p == -1) {
            break;
        } else {
            if (p <= 1) {
                printf("0\n");
            } else {
                printf("%d\n", p - 1);
            }
        }
    }

    return 0;
}
