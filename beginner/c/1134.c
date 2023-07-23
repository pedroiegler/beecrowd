#include <stdio.h>

int main() {
    
    int tipo = 0, contAlcool = 0, contDiesel = 0, contGasolina = 0;

    while(tipo != 4){
        scanf("%d", &tipo);

        if(tipo == 1){
            contAlcool+=1;
        } else if(tipo == 2){
            contGasolina+=1;
        } else if(tipo == 3){
            contDiesel+=1;
        }
    }

    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n", contAlcool);
    printf("Gasolina: %d\n", contGasolina);
    printf("Diesel: %d\n", contDiesel);

    return 0;
}
