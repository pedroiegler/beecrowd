#include <stdio.h>

int main() {
    
    int n = 1, i, jogada, contM, contJ;

    while (n != 0){
        scanf("%d", &n);
        contM = 0;
        contJ = 0;

        for(i = 0; i < n; i++){
            scanf("%d", &jogada);

            if(jogada == 0)
                contM+=1;
            else
                contJ+=1;
        }

        printf("Mary won %d times and John won %d times\n", contM, contJ);
    }


    return 0;
}

