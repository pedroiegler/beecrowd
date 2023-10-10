#include <stdio.h>

int main() {
    
    int i, n, s, b, a, s1, b1, a1, somaS = 0, somaS1 = 0, somaB = 0, somaB1 = 0, somaA = 0, somaA1 = 0;
    char nome[50];
    double pontosS, pontosB, pontosA;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%s", nome);
        scanf("%d %d %d", &s, &b, &a);
        scanf("%d %d %d", &s1, &b1, &a1);

        somaS += s;
        somaS1 += s1;
        somaB += b;
        somaB1 += b1;
        somaA += a;
        somaA1 += a1;

    }

    pontosS = (somaS1 * 100.0) / somaS;
    pontosB = (somaB1 * 100.0) / somaB;
    pontosA = (somaA1 * 100.0) / somaA;

    printf("Pontos de Saque: %.2lf %%.\n", pontosS);
    printf("Pontos de Bloqueio: %.2lf %%.\n", pontosB);
    printf("Pontos de Ataque: %.2lf %%.\n", pontosA);

    return 0;
}