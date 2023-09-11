#include <stdio.h>
#include <math.h>
 
int main() {
 
    double volume, diametro;

    while(scanf("%lf", &volume) != EOF && scanf("%lf", &diametro)){
        double altura = volume / (3.14 * pow((diametro/2),2));
        double area = pow((diametro/2),2) * 3.14;

        printf("ALTURA = %.2lf\n", altura);
        printf("AREA = %.2lf\n", area);
    }
 
    return 0;
}