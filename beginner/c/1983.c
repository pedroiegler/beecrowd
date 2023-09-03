#include <stdio.h>

int main() {

    int n, i, matricula, matricular_maior;
    double nota, maior = 0;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d %lf", &matricula, &nota);

        if(nota > maior){
            maior = nota;
            matricular_maior = matricula;
        }

    }

    if(maior > 8){
        printf("%d\n", matricular_maior);
    } else{
        printf("Minimum note not reached\n");
    }

    return 0;
}
