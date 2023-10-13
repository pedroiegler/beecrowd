#include <stdio.h>
#include <string.h>

int main() {
    int n = 1, i, nf, soma;
    char nomeFruta[50];

    while (1) {
        soma = 0;
        scanf("%d", &n);
        getchar(); 

        if(n == 0)
            break;

        for (i = 0; i < n; i++) {
            scanf("%d", &nf);
            getchar(); 
            fgets(nomeFruta, sizeof(nomeFruta), stdin);
            nomeFruta[strcspn(nomeFruta, "\n")] = '\0'; 

            if (strcmp(nomeFruta, "suco de laranja") == 0) {
                soma += (120 * nf);
            } else if (strcmp(nomeFruta, "morango fresco") == 0) {
                soma += (85 * nf);
            } else if (strcmp(nomeFruta, "mamao") == 0) {
                soma += (85 * nf);
            } else if (strcmp(nomeFruta, "goiaba vermelha") == 0) {
                soma += (70 * nf);
            } else if (strcmp(nomeFruta, "manga") == 0) {
                soma += (56 * nf);
            } else if (strcmp(nomeFruta, "laranja") == 0) {
                soma += (50 * nf);
            } else if (strcmp(nomeFruta, "brocolis") == 0) {
                soma += (34 * nf);
            }
        }

        if (soma >= 110 && soma <= 130) {
            printf("%d mg\n", soma);
        } else if (soma > 130) {
            printf("Menos %d mg\n", (soma - 130));
        } else if (soma < 110) {
            printf("Mais %d mg\n", (110 - soma));
        }
    }

    return 0;
}
