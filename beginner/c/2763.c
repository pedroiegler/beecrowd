
#include <stdio.h>
#include <string.h>

int main() {
    char string[20];

    scanf("%s", string);

    char *token;

    token = strtok(string, ".-");

    while (token != NULL) {
        printf("%s\n", token);
        token = strtok(NULL, ".-");
    }

    return 0;
}
