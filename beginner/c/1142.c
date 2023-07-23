#include <stdio.h>

int main() {
    
    int i, n, x = 0, cont = 0;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        x++;
        printf("%d ", x);
        cont++;
        x++;
        printf("%d ", x);
        cont++;
        x++;
        printf("%d ", x);
        cont++;
        printf("PUM\n");
        cont = 0;
        x++;

    }



    return 0;
}
