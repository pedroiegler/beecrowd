#include <stdio.h>

int main(){

    double raio;

    scanf("%lf", &raio);

    double area = 3.14159 * pow(raio,2);

    printf("A=%.4lf\n", area);

    return 0;
}
