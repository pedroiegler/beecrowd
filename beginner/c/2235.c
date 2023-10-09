#include <stdio.h>

int main() {
    int a, b, c;
    
    scanf("%i %i %i", &a, &b, &c);
    
    if (a != b + c && b != a + c && c != a + b && a != b && a != c && b != c)
        printf("N\n");
    else
        printf("S\n");

    return 0;
}