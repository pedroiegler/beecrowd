#include <stdio.h>

int main(){

    int idade;

    scanf("%d", &idade);

    int ano = idade / 365;
    int resto = idade % 365;
    int mes = resto / 30;
    int dias = resto % 30;

    printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);

    return 0;
}
