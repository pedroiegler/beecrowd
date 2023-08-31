#include <stdio.h>

int main() {
    int vaNum[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    const char *vaRom[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    int N;
    scanf("%d", &N);

    int i = 0;
    while (N > 0) {
        if (N >= vaNum[i]) {
            printf("%s", vaRom[i]);
            N -= vaNum[i];
        } else {
            i++;
        }
    }

    printf("\n");

    return 0;
}
