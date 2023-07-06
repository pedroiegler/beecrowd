#include <stdio.h>

int main(){

    int tempo;

    scanf("%d", &tempo);

    int hora = tempo / 3600;
    int resto = tempo % 3600;

    int minutos = resto / 60;
    int segundos = resto % 60;

    printf("%d:%d:%d\n", hora,minutos,segundos);

    return 0;
}
