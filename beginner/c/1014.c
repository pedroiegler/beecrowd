#include <stdio.h>

int main(){

    int a;
    double b;

    scanf("%d", &a);
    scanf("%lf", &b);

    double x = a / b;

    printf("%.3lf km/l\n", x);

    return 0;
}
