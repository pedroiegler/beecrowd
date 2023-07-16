#include <stdio.h>
int main(){

    int i, n, quant, contR = 0, contS = 0, contC = 0, contT = 0;
    double mediaS = 0, mediaR = 0, mediaC = 0;
    char tipo;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d %c", &quant, &tipo);

        contT += quant;

        if(tipo == 'R')
            contR += quant;
        else if(tipo == 'S')
            contS += quant;
        if(tipo == 'C')
            contC += quant;
        
    }

    mediaS = (contS * 100.0) / contT;
    mediaR = (contR * 100.0) / contT;
    mediaC = (contC * 100.0) / contT;

    printf("Total: %d cobaias\n", contT);
    printf("Total de coelhos: %d\n", contC);
    printf("Total de ratos: %d\n", contR);
    printf("Total de sapos: %d\n", contS);
    printf("Percentual de coelhos: %.2lf %%\n", mediaC);
    printf("Percentual de ratos: %.2lf %%\n", mediaR);
    printf("Percentual de sapos: %.2lf %%\n", mediaS);


    return 0;
    
}