#include <stdio.h>

int main() {
    int atendidos[3];
    int requisitados[3];
    int nao_atendidos = 0;

    scanf("%d %d %d", &atendidos[0], &atendidos[1], &atendidos[2]);
    scanf("%d %d %d", &requisitados[0], &requisitados[1], &requisitados[2]);

    for (int i = 0; i < 3; i++) {
        if (requisitados[i] > atendidos[i]) {
            nao_atendidos += requisitados[i] - atendidos[i];
        }
    }

    printf("%d\n", nao_atendidos);

    return 0;
}
