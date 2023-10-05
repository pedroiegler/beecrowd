#include <stdio.h>
#include <string.h>

int main() {
    char mensagem[101];
    scanf("%s", mensagem);

    int tamanho = strlen(mensagem);
    int contador = 0;

    for (int i = 0; i < tamanho; i++) {
        if (mensagem[i] == '1') {
            contador++;
        }
    }

    if (contador % 2 == 0) {
        strcat(mensagem, "0");
    } else {
        strcat(mensagem, "1");
    }

    printf("%s\n", mensagem);

    return 0;
}
