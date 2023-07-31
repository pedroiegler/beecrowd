#include <stdio.h>

int main(){

   int i, n, v[1000], aux = 0;

    scanf("%d", &n);

    for(i = 0; i < 1000; i++){
        v[i] = aux;
        aux++;
        if(aux == n){
            aux = 0;
        }
    }

    for(i = 0; i < 1000; i++){
        printf("N[%d] = %d\n", i, v[i]);
    }
    

   return 0;
}
