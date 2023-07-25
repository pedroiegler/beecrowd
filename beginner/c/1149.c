#include <stdio.h>
int main(){

    int n = 1, a, soma = 0, i;

    scanf("%d %d", &a, &n);

    while (n <= 0)
        scanf("%d", &n);

    for(i = 1; i <= n; i++){
        soma += a;
        a++;
    }

    printf("%d\n", soma);

    return 0;
}