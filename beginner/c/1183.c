#include <stdio.h>

int main() {

    double m[12][12], soma = 0.0;
    int i, j;
    char operacao;

    scanf(" %c", &operacao);

    for (i = 0; i < 12; i++) {
        for (j = 0; j < 12; j++) {
            scanf("%lf", &m[i][j]);
        }
    }

    int elementos_acima_diagonal = 0;
    for (i = 0; i < 12; i++) {
        for (j = i + 1; j < 12; j++) { 
            soma += m[i][j];
            elementos_acima_diagonal++;
        }
    }

    if (operacao == 'S') {
        printf("%.1lf\n", soma);
    } else if (operacao == 'M') {
        printf("%.1lf\n", soma / elementos_acima_diagonal);
    }

    return 0;
}
