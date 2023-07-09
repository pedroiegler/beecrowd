#include <stdio.h>

int main(){

    float valor;

    scanf("%f", &valor);

    if(valor >= 0 && valor <= 400.00){
        printf("Novo salario: %.2f\n", ((valor * 0.15) + valor));
        printf("Reajuste ganho: %.2f\n", (valor * 0.15));
        printf("Em percentual: 15 %%\n");
    }

    else if(valor >= 400.01 && valor <= 800.00){
        printf("Novo salario: %.2f\n", ((valor * 0.15) + valor));
        printf("Reajuste ganho: %.2f\n", (valor * 0.15));
        printf("Em percentual: 15 %%\n");
    }

    else if(valor >= 800.01 && valor <= 1200.00){
        printf("Novo salario: %.2f\n", ((valor * 0.10) + valor));
        printf("Reajuste ganho: %.2f\n", (valor * 0.10));
        printf("Em percentual: 10 %%\n");
    }

    else if(valor >= 1200.01 && valor <= 2000.00){
        printf("Novo salario: %.2f\n", ((valor * 0.07) + valor));
        printf("Reajuste ganho: %.2f\n", (valor * 0.07));
        printf("Em percentual: 7 %%\n");
    }

    else{
        printf("Novo salario: %.2f\n", ((valor * 0.04) + valor));
        printf("Reajuste ganho: %.2f\n", (valor * 0.04));
        printf("Em percentual: 4 %%\n");
    }

    return 0;
}
