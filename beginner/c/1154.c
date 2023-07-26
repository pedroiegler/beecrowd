#include <stdio.h>
int main(){

    int i, idade, soma = 0, total = 0;
    double media;

    for(;;){
        scanf("%d", &idade);
        if(idade >= 0){
            soma += idade;
            total++;
        }else{
            break;
        }
    }

    media = (double) soma / total;

    printf("%.2lf\n", media);

    return 0;
}