#include <stdio.h>

int main() {
    double n1, n2, media;
    int nota_valida = 0;

    while (nota_valida != 1){
        scanf("%lf", &n1);
        if(n1 < 0.0 || n1 > 10.0)
            printf("nota invalida\n");
        else
            nota_valida+=1;
    }

    nota_valida = 0;

    while (nota_valida != 1){
        scanf("%lf", &n2);
        if(n2 < 0.0 || n2 > 10.0)
            printf("nota invalida\n");
        else
            nota_valida+=1;
    }

    media = (n1 + n2) / 2.0;

    printf("media = %.2lf\n", media);

    return 0;
}
