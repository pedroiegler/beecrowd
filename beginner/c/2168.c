#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    int cameras[N+1][N+1];
    char quadras[N][N];

    for (int i = 0; i <= N; i++) {
        for (int j = 0; j <= N; j++) {
            scanf("%d", &cameras[i][j]);
        }
    }

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            int camerasAtivadas = cameras[i][j] + cameras[i][j+1] + cameras[i+1][j] + cameras[i+1][j+1];
            if (camerasAtivadas >= 2) {
                quadras[i][j] = 'S';
            } else {
                quadras[i][j] = 'U';
            }
        }
    }

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%c", quadras[i][j]);
        }
        printf("\n"); 
    }

    return 0;
}

