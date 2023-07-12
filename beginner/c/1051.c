#include <stdio.h>
int main(){

    double salario, taxa = 0;

    scanf("%lf", &salario);

    if(salario >= 0.00 && salario <= 2000.00){
        printf("Isento\n");
    } else if(salario >= 2000.01 && salario <= 3000.00){
        printf("R$ %.2lf\n", ((salario - 2000)  * 0.08));
    } else if(salario >= 3000.01 && salario <= 4500.00){
        printf("R$ %.2lf\n", ((1000 * 0.08) + ((salario - 3000) * 0.18)));
    } else{
        printf("R$ %.2lf\n", ((1000 * 0.08) + (1500 * 0.18)  + ((salario - 4500) * 0.28)));
    }

    return 0;
    
}