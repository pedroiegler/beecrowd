#include <stdio.h>

int main() {
    int n, nn, nm, i, cont, x;

    while (scanf("%d %d %d", &n, &nn, &nm) != EOF) {
        cont = 0;
        for (i = 0; i < n; i++) {
            scanf("%d", &x);
            if (x >= nn && x <= nm)
                cont++;
        }
        printf("%d\n", cont);
    }

    return 0;
}
