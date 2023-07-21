#include <stdio.h>

int main() {
    
    int x = 0, y = 0, i, menor, maior, soma = 0;

    scanf("%d %d", &x, &y);

    if(x < y){
        menor = x;
        maior = y;
    } else{
        menor = y;
        maior = x;
    }

    for(i = menor; i <= maior; i++){
        if(i % 13 != 0)
            soma+=i;
    }

    printf("%d\n", soma);
    
    return 0;
}
