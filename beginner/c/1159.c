#include <stdio.h>

int main() {
    int x, soma, cont;

    while (1) {
        soma = 0;
        cont = 0;
        scanf("%d", &x);

        if (x == 0)
            break;

        while (cont < 5) {
            if (x % 2 == 0) {
                soma += x;
                cont++;
            }
            x++;
        }

        printf("%d\n", soma);
    }

    return 0;
}
