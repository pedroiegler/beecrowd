#include <stdio.h>
#include <string.h>

int main() {
    
    int n, i, a, b, c;
    char val[50];

    scanf("%d", &n);

    for(i = 1; i <= n; i++){
        scanf("%s", val);
        scanf("%d %d %d", &a, &b, &c);

        if(strcmp(val,"eye") == 0){
            printf("Caso #%d: %d\n", i, (int) (0.30*a + 0.59*b + 0.11*c));
        } else if(strcmp(val,"mean") == 0){
            printf("Caso #%d: %d\n", i, ((a + b + c) / 3));
        } else if(strcmp(val,"max") == 0){
            if(a > b && a > c)
                printf("Caso #%d: %d\n", i, a);
            else if(b > a && b > c)
                printf("Caso #%d: %d\n", i, b);
            else
                printf("Caso #%d: %d\n", i, c);
        } else if(strcmp(val,"min") == 0){
            if(a < b && a < c)
                printf("Caso #%d: %d\n", i, a);
            else if(b < a && b < c)
                printf("Caso #%d: %d\n", i, b);
            else
                printf("Caso #%d: %d\n", i, c);
        }
    }

    return 0;
}
