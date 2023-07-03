#include <stdio.h>

int main(){

    int codPeca1, codPeca2, numPeca1, numPeca2;
    double valorPeca1, valorPeca2;

    scanf("%d %d %lf", &codPeca1, &numPeca1, &valorPeca1);
    scanf("%d %d %lf", &codPeca2, &numPeca2, &valorPeca2);

    double valorPagar = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

    printf("VALOR A PAGAR: R$ %.2lf\n", valorPagar);    

    return 0;
}
