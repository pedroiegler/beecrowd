#include <stdio.h>

int main() {
    
    float n1, n2, i, media = 0;
    int nota_valida = 0, x = 1;

    while(x == 1){
        while(nota_valida != 1){
            scanf("%f", &n1);
            if(n1 < 0.0 || n1 > 10.0)
                printf("nota invalida\n");
            else
                nota_valida+=1;
        }

        nota_valida = 0;

        while(nota_valida != 1){
            scanf("%f", &n2);
            if(n2 < 0.0 || n2 > 10.0)
                printf("nota invalida\n");
            else
                nota_valida+=1;
        }

        nota_valida = 0;

        media = (n1 + n2) / 2;

        printf("media = %.2f\n", media);

        printf("novo calculo (1-sim 2-nao)\n");
        scanf("%d", &x);

        if(x != 1 && x != 2){
            printf("novo calculo (1-sim 2-nao)\n");
            scanf("%d", &x);
        } else if(x == 2){
            break;
        }

    }
    
    return 0;
}
