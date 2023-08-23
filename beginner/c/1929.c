#include <stdio.h>

int main() {
    int numeros[4]; 
    for (int i = 0; i < 4; i++) {
        scanf("%d", &numeros[i]); 
    }

    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 4; j++) {
            if (numeros[i] > numeros[j]) {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
    }

    if (numeros[0] + numeros[1] > numeros[2] || numeros[1] + numeros[2] > numeros[3]) 
        printf("S\n");
    else 
        printf("N\n");

    return 0;
}
