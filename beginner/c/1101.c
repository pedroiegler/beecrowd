#include <stdio.h>

int main() {

    int n, i, m, soma = 0, menor, maior;

    for(;;){
        soma = 0;
        scanf("%d %d", &n, &m);

        if(n <= 0 || m <= 0)
            break;
        else{
            if(n < m){
                menor = n;
                maior = m;
            } else{
                menor = m;
                maior = n;
            }

            for(i = menor; i <= maior; i++){
                printf("%d ", i);
                soma += i;
            }
            printf("Sum=%d\n", soma);
        }
    }

    return 0;
}
