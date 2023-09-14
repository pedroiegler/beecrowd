#include <stdio.h>
#include <string.h>

int main() {
    int saida, tempo, fuso;

    scanf("%d %d %d", &saida, &tempo, &fuso);

    if(saida == 0)
        saida = 24;

    int chegada = saida + tempo + fuso;

    if(chegada > 24){
        chegada -= 24;
        printf("%d\n", chegada);
    } else if(chegada == 24){
        chegada = 0;
        printf("%d\n", chegada);
    } else{
        printf("%d\n", chegada);
    }

    

    return 0;
}
