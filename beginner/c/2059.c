#include <stdio.h>
#include <string.h>

int main() {
    int p, j1, j2, r, a;

    scanf("%d %d %d %d %d", &p, &j1, &j2, &r, &a);

    int soma = j1 + j2;

    if(p == 1){
        if(soma % 2 == 0){
            if(r == 0){
                if(a == 0 || a == 1){
                    printf("Jogador 1 ganha!\n");
                } 
            } else if(r == 1){
                if(a == 0){
                    printf("Jogador 1 ganha!\n");
                } else if(a == 1){
                    printf("Jogador 2 ganha!\n");
                } 
            }
        } else{
           if(r == 0){
                if(a == 0){
                    printf("Jogador 2 ganha!\n");
                } else if(a == 1){
                    printf("Jogador 1 ganha!\n");
                } 
            } else if(r == 1){
                if(a == 0){
                    printf("Jogador 1 ganha!\n");
                } else if(a == 1){
                    printf("Jogador 2 ganha!\n");
                } 
            }   
        }
    } else if(p == 0){
        if(soma % 2 != 0){
            if(r == 0){
                if(a == 0 || a == 1){
                    printf("Jogador 1 ganha!\n");
                } 
            } else if(r == 1){
                if(a == 0){
                    printf("Jogador 1 ganha!\n");
                } else if(a == 1){
                    printf("Jogador 2 ganha!\n");
                } 
            }
        } else{ 
           if(r == 0){
                if(a == 0){
                    printf("Jogador 2 ganha!\n");
                } else if(a == 1){
                    printf("Jogador 1 ganha!\n");
                } 
            } else if(r == 1){
                if(a == 0){
                    printf("Jogador 1 ganha!\n");
                } else if(a == 1){
                    printf("Jogador 2 ganha!\n");
                } 
            }   
        }
    }

    return 0;
}
