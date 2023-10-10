#include <stdio.h>

int main() {
    
    int n, i, j;
    float maior = 0.0, menor = 0.0, num, notas, soma = 0.0;
    char nome[50];

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        soma = 0.0;
        
        scanf("%s", nome);
        scanf("%f", &num);

        for(j = 0; j < 7; j++){
            scanf("%f", &notas);

            if(j == 0){
                maior = notas;
                menor = notas;
            }

            if(notas > maior){
                maior = notas;
            }

            if(notas < menor){
                menor = notas;
            }

            soma += notas;
        }


        printf("%s %.2f\n", nome, ((soma - (maior + menor)) * num));

    }

    return 0;
}