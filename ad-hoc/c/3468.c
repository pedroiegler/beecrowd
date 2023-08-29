#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char idea[20];
    scanf("%s", idea);

    // Converter a entrada para letras minúsculas para facilitar a comparação
    for (int i = 0; idea[i]; i++) {
        idea[i] = tolower(idea[i]);
    }

    if (strcmp(idea, "oposicao") == 0 || strcmp(idea, "contrariedade") == 0) {
        printf("mas\n");
    } else if (strcmp(idea, "quantidade") == 0 || strcmp(idea, "intensidade") == 0) {
        printf("mais\n");
    }

    return 0;
}
