#include <stdio.h>
int main(){

    int x, y, soma = 0, menor = 0, maior = 0, i;

    scanf("%d", &x);
    scanf("%d", &y);

    if(x < y){
        menor = x;
        maior = y;
    } 
    if(y < x){
        menor = y;
        maior = x;
    }

    if(menor % 2 != 0){
        for(i = menor+1; i < maior; i++){
            if(i % 2 != 0){
                soma = soma + i;
            }
        }
    }
    else{
        for(i = menor; i < maior; i++){
            if(i % 2 != 0){
                soma = soma + i;
            }
        }
    }
    

    printf("%d\n", soma);

    return 0;
    
}