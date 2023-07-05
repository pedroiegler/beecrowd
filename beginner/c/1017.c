#include <stdio.h>

int main(){

    int tempoViagem, velocidadeMedia;

    scanf("%d", &tempoViagem);
    scanf("%d", &velocidadeMedia);

    double qtdLitro = (tempoViagem * velocidadeMedia) / 12.0;

    printf("%.3lf\n", qtdLitro);

    return 0;
}