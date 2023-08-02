#include <stdio.h>

int main() {
    double m[12][12], soma = 0.0;
    int i, j, n;
    char operacao;

    scanf("%d", &n);
    scanf(" %c", &operacao);

    for (i = 0; i < 12; i++) {
        for (j = 0; j < 12; j++) {
            scanf("%lf", &m[i][j]);
        }
    }

    if(operacao == 'S'){
        for(i = 0; i < 12; j++){
            soma += m[i][n];
        }
        printf("%.1lf\n", soma);
    } else if(operacao == 'M'){
        for(i = 0; i < 12; i++){
            soma += m[i][n];
        }
        printf("%.1lf\n", soma/12);
    }

    /*for (i = 0; i < 12; i++) {
        for (j = 0; j < 12; j++) {
            printf("%lf\t", m[i][j]);
        }
        printf("\n");
    }*/

    return 0;
}
