#include <stdio.h>

int main(){

    char nome[255];
    double salario, totalVendas;

    scanf("%s", nome);
    scanf("%lf", &salario);
    scanf("%lf", &totalVendas);

    double total = salario + (totalVendas * 0.15);
    
    printf("TOTAL = R$ %.2lf\n", total);

    return 0;
}
