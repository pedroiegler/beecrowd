#include <stdio.h>

int main() {
    int vetPar[5], vetImpar[5], i, j, n, auxPar = 0, auxImpar = 0;

    for (i = 0; i < 15; i++) {
        scanf("%d", &n);
        if (n % 2 == 0) {
            vetPar[auxPar] = n;
            auxPar++;

            if (auxPar == 5) {
                for (j = 0; j < 5; j++) {
                    printf("par[%d] = %d\n", j, vetPar[j]);
                }
                auxPar = 0;
            }
        } else {
            vetImpar[auxImpar] = n;
            auxImpar++;
            if (auxImpar == 5) {
                for (j = 0; j < 5; j++) {
                    printf("impar[%d] = %d\n", j, vetImpar[j]);
                }
                auxImpar = 0;
            }
        }
    }

    for (i = 0; i < auxImpar; i++) {
        printf("impar[%d] = %d\n", i, vetImpar[i]);
    }
    for (i = 0; i < auxPar; i++) {
        printf("par[%d] = %d\n", i, vetPar[i]);
    }

    return 0;
}
