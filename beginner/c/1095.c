#include <stdio.h>
int main(){

    int i, j;

    i = 1;
    j = 60;

    for(;;){

        printf("I=%d J=%d\n", i, j);

        i = i + 3;
        j = j - 5;

        if(j < 0){
            break;
        }
    }


    return 0;
    
}