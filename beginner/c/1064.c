#include <stdio.h>
int main(){

    int i = 0, cont = 0;
    double n, media = 0;
    
    for(i = 0; i < 6; i++){
        scanf("%lf", &n);
        if(n > 0){
            cont++;
            media += n;
        }
    }

    media = media / cont;
    
    printf("%d valores positivos\n", cont);
    printf("%.1lf\n", media);

    return 0;
    
}