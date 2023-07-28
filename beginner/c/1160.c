#include <stdio.h>

int main() {

    int t, i, pa, pb, cont;
    double g1, g2;

    scanf("%d", &t);

    for(i = 0; i < t; i++){
        cont = 0;
        scanf("%d %d %lf %lf", &pa, &pb, &g1, &g2);

        for(;;){
            cont++;
            pa = pa + ((pa * g1) / 100);
            pb = pb + ((pb * g2) / 100);

            if(cont > 100){
                printf("Mais de 1 seculo.\n");
                break;
            } else if(pa > pb){
                printf("%d anos.\n", cont);
                break;
            }
        }

    }

    return 0;
}
