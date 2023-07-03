#include <stdio.h>

int main(){

    int number;
    int numHora;
    double valorHora;

    scanf("%d", &number);
    scanf("%d", &numHora);
    scanf("%lf", &valorHora);

    double salario = numHora * valorHora;

    printf("NUMBER = %d\nSALARY = U$ %.2lf\n", number, salario);

    return 0;
}
