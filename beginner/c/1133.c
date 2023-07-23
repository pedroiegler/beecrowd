#include <stdio.h>

int main() {
    
    int i, n1, n2, menor, maior;

    scanf("%d", &n1);
    scanf("%d", &n2);

    if(n1 > n2){
        maior = n1;
        menor = n2;
    } else{
        maior = n2;
        menor = n1;
    }

    menor = menor + 1;

    for(i = menor; i < maior; i++){
        if(i % 5 == 2 || i % 5 == 3){
            printf("%d\n", i);
        }
    }

    return 0;
}
