#include <stdio.h>

int main() {
    int N, M;
    scanf("%d", &N);
    scanf("%d", &M);

    int album[N + 1];
    for (int i = 1; i <= N; i++) {
        album[i] = 0; 
    }

    for (int i = 0; i < M; i++) {
        int figurinha;
        scanf("%d", &figurinha);
        album[figurinha] = 1;
    }

    int faltam = 0;
    for (int i = 1; i <= N; i++) {
        if (album[i] == 0) {
            faltam++; 
        }
    }

    printf("%d\n", faltam);

    return 0;
}
