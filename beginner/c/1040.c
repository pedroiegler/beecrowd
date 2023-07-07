#include <stdio.h>

int main(){

    double n1, n2, n3, n4;

    scanf("%lf %lf %lf %lf", &n1, &n2, &n3, &n4);

    double media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;
    double exame;

    printf("Media: %.1f\n", media);

    if(media >= 7.0){
        printf("Aluno aprovado.\n");
    } else if(media < 5.0){
        printf("Aluno reprovado.\n");
    } else{
        printf("Aluno em exame.\n");
        scanf("%lf", &exame);
        printf("Nota do exame: %.1lf\n", exame);
        media = (exame + media) / 2;
        if(media >= 5.0){
            printf("Aluno aprovado.\n");
            printf("Media final: %.1lf\n", media);
        } else{
            printf("Aluno reprovado.\n");
            printf("Media final: %.1lf\n", media);
        }
    }

    return 0;
}
