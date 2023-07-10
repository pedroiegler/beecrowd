#include <stdio.h>

int main(){

    int horaIni, horaFin, cont = 0;

    scanf("%d %d", &horaIni, &horaFin);

    for(;;){
        horaIni++;
        cont++;
        if(horaIni == 24){
            horaIni = 0;
        }
        if(horaIni == horaFin){
            break;
        }
    }

    printf("O JOGO DUROU %d HORA(S)\n", cont);

    return 0;
}
