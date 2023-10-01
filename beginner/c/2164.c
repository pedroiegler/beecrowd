#include <stdio.h>
#include <math.h>

int main() {
    int n;

    scanf("%d", &n);

    double result = (pow((((1 + sqrt(5)) / 2)),n) - pow((((1 - sqrt(5)) / 2)),n)) / sqrt(5);

    printf("%.1lf\n", result);

    return 0;
}
