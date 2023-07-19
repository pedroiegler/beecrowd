#include <stdio.h>

int main() {

    int i, j, n, n1, n2, soma, maior = 0, menor = 0;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        soma = 0;
        scanf("%d %d", &n1, &n2);

        if(n1 < n2){
            menor = n1+1;
            maior = n2;
        } else{
            menor = n2+1;
            maior = n1;
        }

        for(j = menor; j < maior; j++){
            if(j % 2 != 0){
                soma += j;
            }
        }

        printf("%d\n", soma);
    }

    return 0;
}
