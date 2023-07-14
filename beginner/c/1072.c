#include <stdio.h>
int main(){

    int n, x, contIn = 0, contOut = 0;

    scanf("%d", &n);

    for(int i = 0; i < n; i++){
        scanf("%d", &x);

        if(x >= 10 && x <= 20){
            contIn++;
        } else{
            contOut++;
        }
    }

    printf("%d in\n", contIn);
    printf("%d out\n", contOut);

    return 0;
    
}