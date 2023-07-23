#include <stdio.h>

int main() {
    
    int i, n, x = 0, cont = 0;

    scanf("%d", &n);

    for(i = 1; i <= n; i++){
        x+=i;
        printf("%d ", x);
        x*=i;
        printf("%d ", x);
        x*=i;
        printf("%d\n", x);
        x = 0;

    }



    return 0;
}
