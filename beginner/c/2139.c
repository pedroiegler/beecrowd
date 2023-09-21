#include <stdio.h>

int main() {
    int mes, dia;
    
    while (scanf("%d %d", &mes, &dia) != EOF) {
        int dias_no_mes[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25};
        int dias_faltando;

        if (mes == 12 && dia == 25) {
            printf("E natal!\n");
        } else if (mes == 12 && dia == 24) {
            printf("E vespera de natal!\n");
        } else if (mes == 12 && dia > 25) {
            printf("Ja passou!\n");
        } else {
            dias_faltando = dias_no_mes[mes - 1] - dia;
            for (int i = mes; i < 12; i++) {
                dias_faltando += dias_no_mes[i];
            }
            printf("Faltam %d dias para o natal!\n", dias_faltando);
        }
    }
    
    return 0;
}
