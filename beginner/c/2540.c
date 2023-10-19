#include <stdio.h>

int main() {
    int N, voto;
    
    while (scanf("%d", &N) == 1) {
        int votos_favoraveis = 0;
        
        for (int i = 0; i < N; i++) {
            scanf("%d", &voto);
            votos_favoraveis += voto;
        }
        
        if (votos_favoraveis * 3 >= 2 * N)
            printf("impeachment\n");
        else
            printf("acusacao arquivada\n");
    }

    return 0;
}
