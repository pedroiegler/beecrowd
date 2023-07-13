#include <stdio.h>
int main(){

    int n, i, cont = 0;

    scanf("%d", &n);

    for(i = n; i > 0; i++){
        if(cont == 6){
            break;
        }
        else if(i % 2 != 0){
            printf("%d\n", i);
            cont++;
        }
    }


    return 0;
    
}