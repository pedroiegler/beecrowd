#include <stdio.h>

int main() {

    double m[12][12], soma = 0.0;
    int i, j;
    char operacao;

    scanf(" %c", &operacao);

    for(i = 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            scanf("%lf", &m[i][j]);
        }
    }

    int counter = 1;
    int cont = 0;
    while(counter < 12){
        for (i = 1; i <= counter; i++) {
            for (j = 1; j <= counter; j++) { 
                soma += m[i][j];
                cont++;
            }
            counter++;
        }
    }

    if(operacao == 'S'){
        printf("%.1lf\n", soma);
    } else if(operacao == 'M'){
        printf("%.1lf\n", soma / cont);
    }

    return 0;
}
