#include <stdio.h>

int main(){

    double nota1;
    double nota2;
    double nota3;

    scanf("%lf", &nota1);
    scanf("%lf", &nota2);
    scanf("%lf", &nota3);

    double media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10;

    printf("MEDIA = %.1lf\n", media);

    return 0;
}
