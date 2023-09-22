#include <stdio.h>

int main() {

    int troco[] = {7, 12, 22, 52, 102, 15, 25, 55, 105, 30, 60, 110, 70, 120, 150, 4, 10, 20, 40, 100, 200};
    int possivel = 0;
    int n, m, valor;

    while(1){
        scanf("%d %d", &n, &m);

        if(n == 0 && m == 0)
            break;
        else
            valor = m - n;

            for(int i = 0; i < 21; i++){
                if(valor == troco[i])
                    possivel = 1;
            }

            if(possivel == 1){
                printf("possible\n");
                possivel = 0;
            }
            else
                printf("impossible\n");
    }
    
    return 0;
}
