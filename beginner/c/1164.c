#include <stdio.h>

int main() {

    int i, j, x, n, soma;

    scanf("%d", &x);

    for(i = 0; i < x; i++){
        soma = 0;
        scanf("%d", &n);

        for(j = 1; j < n; j++){
            if(n % j == 0){
                soma += j;
            }
        }

        if(soma == n){
            printf("%d eh perfeito\n", n);
        } else{
            printf("%d nao eh perfeito\n", n);
        }

    }

    return 0;
}
