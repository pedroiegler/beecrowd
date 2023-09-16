#include <stdio.h>

int main() {
    char data[10]; 
    int dia, mes;

    scanf("%s", data);

    sscanf(data, "%d/%d", &dia, &mes);

    if((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20))
        printf("aries\n");
    else if((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20))
        printf("touro\n");
    else if((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20))
        printf("gemeos\n");
    else if((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22))
        printf("cancer\n");
    else if((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22))
        printf("leao\n");
    else if((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22))
        printf("virgem\n");
    else if((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22))
        printf("libra\n");
    else if((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21))
        printf("escorpiao\n");
    else if((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21))
        printf("sagitario\n");
    else if((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19))
        printf("capricornio\n");
    else if((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18))
        printf("aquario\n");
    else if((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20))
        printf("peixes\n");

    return 0;
}
