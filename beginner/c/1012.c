#include <stdio.h>
#include <math.h>

int main(){

    double a, b, c;
    double pi = 3.14159;

    scanf("%lf %lf %lf", &a, &b, &c);

    double areaTriangulo = (a*c) / 2;
    double areaCirculo = pi * pow(c,2);
    double areaTrapezio = ((a + b) * c) / 2;
    double areaQuadrado = pow(b,2);
    double areaRetangulo = a * b;

    printf("TRIANGULO: %.3lf\n" 
           "CIRCULO: %.3lf\n"
           "TRAPEZIO: %.3lf\n"
           "QUADRADO: %.3lf\n"
           "RETANGULO: %.3lf\n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

    return 0;
}
