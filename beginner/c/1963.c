#include <stdio.h>

int main() {

    double valor, valorNovo;

    scanf("%lf %lf", &valor, &valorNovo);

    printf("%.2lf%%\n", ((valorNovo * 100)/valor) - 100);
    
    return 0;
}
