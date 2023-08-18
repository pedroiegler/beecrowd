#include <stdio.h>
#include <string.h>

int main() {
    
    int i, j, n, x, cont = 1, v, soma;

    scanf("%d", &n);

    for(i = 0; i < n; i++){

        soma = 0;

        scanf("%d", &v);

        for(j = 1; j <= v; j++){
            if(j % 2 != 0){
                soma += cont;
            } else{
                soma -= cont;
            }
        }

        printf("%d\n", soma);
    }


    return 0;
}
