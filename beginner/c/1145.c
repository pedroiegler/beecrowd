#include <stdio.h>
int main(){

    int i, x, y, cont = 0;

    scanf("%d %d", &x, &y);

    for(i = 1; i <= y; i++){
        printf("%d", i);
        cont+=1;
        if(cont == x){
            printf("\n");
            cont = 0;
        }else{
            printf(" ");
        }
    }

    return 0;
}