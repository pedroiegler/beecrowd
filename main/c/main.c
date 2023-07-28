#include <stdio.h>

int main() {

    int i, n, x;

    scanf("%d", &x);

    for(i = 0; i < x; i++){
        scanf("%d", &n);

        if(n % n != 0 || n % 1 != 0){
            printf("%d nao eh primo\n", n);
        } else{
            printf("%d eh primo\n", n);
        }
    }

    return 0;
}
