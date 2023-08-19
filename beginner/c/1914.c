#include <stdio.h>
#include <string.h>

int main() {
    
    int i, n, p1, p2;
    char nome1[100], nome2[100], jogada1[10], jogada2[10];

    scanf("%d", &n);

    for(i = 0; i < n; i++){

        scanf("%s %s %s %s", nome1, jogada1, nome2, jogada2);
        scanf("%d %d", &p1, &p2);

        if ((p1 + p2) % 2 == 0) {
            if (strcmp(jogada1, "PAR") == 0) {
                printf("%s\n", nome1);
            } else {
                printf("%s\n", nome2);
            }
        } else {
            if (strcmp(jogada1, "IMPAR") == 0) {
                printf("%s\n", nome1);
            } else {
                printf("%s\n", nome2);
            }
        }
    }

    return 0;
}