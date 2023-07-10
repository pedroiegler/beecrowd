#include <stdio.h>
int main()
{
    int horaIni, horaFim, minIni, minFim, dif;
    scanf("%d %d %d %d", &horaIni, &minIni, &horaFim, &minFim);

    dif = ((horaFim * 60) + minFim) - ((horaIni * 60) + minIni);

    if(dif <= 0) 
        dif += 24 * 60;

    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dif/60, dif%60);

    return 0;
    
}