#include <stdio.h>
int main(){

    int n, i, x;

    while(n != 0){
        scanf("%d", &n);

        for(x = 1; x <= n; x++){
            if(x == n){
                printf("%d\n", x);
            } else{
                printf("%d ", x);
            }
        }
    }


    return 0;
}