#include <stdio.h>
int main(){

    int i, n, cont = 0;

    for(i = 0; i < 5; i++){
        scanf("%d", &n);
        if(n % 2 == 0){
            cont+=1;
        }
    }

    printf("%d valores pares\n", cont);

    return 0;
    
}