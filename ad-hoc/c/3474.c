#include <stdio.h>
 
int main() {
    double valorFigurinha;
    int numIntegrantes;

    while (scanf("%lf %d", &valorFigurinha, &numIntegrantes) == 2) {
        double valorPorIntegrante = valorFigurinha / numIntegrantes;
        printf("%.2lf\n", valorPorIntegrante);
    }
 
    return 0;
}
