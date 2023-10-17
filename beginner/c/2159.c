#include <stdio.h>

int main() {
    int n;
    
    scanf("%i", &n);
    
    printf("%.1lf %.1lf\n", n/log(n), 1.25506 * n/log(n));

    return 0;
}