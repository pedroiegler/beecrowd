#include <stdio.h>
int main(){

    int i, x, y, n, j, cont = 0, soma;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        soma = 0;
        cont = 0;
        scanf("%d %d", &x, &y);

        while(cont != y){
            if(x % 2 != 0){
                soma += x;
                cont++;
            }
            x++;
        }

        printf("%d\n", soma);
    }

    return 0;
}