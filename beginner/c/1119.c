#include <stdio.h>

int main() {
    
    int golInter = 0, golGremio = 0, resposta = 1, qtdGrenais = 0, vitoriaInter = 0, vitoriaGremio = 0, empates = 0;

    while(resposta == 1){
    
        scanf("%d %d", &golInter, &golGremio);

        qtdGrenais+=1;

        if(golInter > golGremio){
            vitoriaInter+=1;
        } else if(golGremio > golInter){
            vitoriaGremio+=1;
        } else if(golInter == golGremio){
            empates+=1;
        }

        printf("Novo grenal (1-sim 2-nao)\n");
        scanf("%d", &resposta);

    }

    printf("%d grenais\n", qtdGrenais);
    printf("Inter:%d\n", vitoriaInter);
    printf("Gremio:%d\n", vitoriaGremio);
    printf("Empates:%d\n", empates);
    if (vitoriaInter > vitoriaGremio)
        printf("Inter venceu mais\n"); 
    else
        printf("Gremio venceu mais\n");

    
    return 0;
}
