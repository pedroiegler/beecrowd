#include <stdio.h>
int main(){

    int n, i, contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;

    for(i = 0; i < 5; i++){
        scanf("%d", &n);
        if(n > 0)
            contPos+=1;
        if(n < 0)
            contNeg+=1;
        if(n % 2 == 0)
            contPar+=1;
        if(n % 2 != 0)
            contImpar+=1;
    }

    printf("%d valor(es) par(es)\n", contPar);
    printf("%d valor(es) impar(es)\n", contImpar);
    printf("%d valor(es) positivo(s)\n", contPos);
    printf("%d valor(es) negativo(s)\n", contNeg);

    return 0;
    
}