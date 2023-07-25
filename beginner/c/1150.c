#include <stdio.h>
int main(){

    int x, z, i, soma = 0, cont = 0;

    scanf("%d", &x);
    scanf("%d", &z);

    while (z <= x){
        scanf("%d", &z);
    }

    for(;;){
        if(soma > z){
            break;
        }else{
            cont++;
            soma += x;
            x++;
        }
    }

    printf("%d\n", cont);
    

    return 0;
}