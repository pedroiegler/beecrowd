#include <stdio.h>
#include <string.h>

int main() {
    int n, i;
    char p1[20], p2[20];

    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        scanf("%s %s", p1, p2);

        if (strcmp(p1, "tesoura") == 0) {
            if (strcmp(p2, "pedra") == 0 || strcmp(p2, "Spock") == 0)
                printf("Caso #%d: Raj trapaceou!\n", i);
            else if (strcmp(p2, "papel") == 0 || strcmp(p2, "lagarto") == 0)
                printf("Caso #%d: Bazinga!\n", i);
			else if (strcmp(p2, "tesoura") == 0)
				printf("Caso #%d: De novo!\n", i);

        } else if (strcmp(p1, "pedra") == 0) {
            if (strcmp(p2, "Spock") == 0 || strcmp(p2, "papel") == 0)
                printf("Caso #%d: Raj trapaceou!\n", i);
            else if (strcmp(p2, "tesoura") == 0 || strcmp(p2, "lagarto") == 0 )
                printf("Caso #%d: Bazinga!\n", i);
			else if (strcmp(p2, "pedra") == 0)
				printf("Caso #%d: De novo!\n", i);

        } else if (strcmp(p1, "papel") == 0) {
            if (strcmp(p2, "pedra") == 0 || strcmp(p2, "Spock") == 0)
                printf("Caso #%d: Bazinga!\n", i);
            else if (strcmp(p2, "tesoura") == 0 || strcmp(p2, "lagarto") == 0)
                printf("Caso #%d: Raj trapaceou!\n", i);
			else if (strcmp(p2, "papel") == 0)
				printf("Caso #%d: De novo!\n", i);

        } else if (strcmp(p1, "Spock") == 0) {
            if (strcmp(p2, "pedra") == 0 || strcmp(p2, "tesoura") == 0)
                printf("Caso #%d: Bazinga!\n", i);
            else if (strcmp(p2, "lagarto") == 0 || strcmp(p2, "papel") == 0)
                printf("Caso #%d: Raj trapaceou!\n", i);
			else if (strcmp(p2, "Spock") == 0)
				printf("Caso #%d: De novo!\n", i);
				
        } else if (strcmp(p1, "lagarto") == 0) {
            if (strcmp(p2, "pedra") == 0 || strcmp(p2, "tesoura") == 0)
                printf("Caso #%d: Raj trapaceou!\n", i);
            else if (strcmp(p2, "Spock") == 0 || strcmp(p2, "papel") == 0)
                printf("Caso #%d: Bazinga!\n", i);
			else if (strcmp(p2, "lagarto") == 0)
				printf("Caso #%d: De novo!\n", i);
        }
    }

    return 0;
}
