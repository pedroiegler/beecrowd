#include <stdio.h>
#include <string.h>

int main() {
    char action[50];
    int i, n, cont1 = 0, cont2 = 0;

    while(1){

        scanf("%s", action);

        if(strcmp(action, "ABEND") == 0)
            break;
        else{
            scanf("%d", &n);
            
            if(strcmp(action, "SALIDA") == 0){
                cont1+=n;
                cont2+=1;
            } else{
                cont1-=n;
                cont2-=1;
            }
        }
    }

    printf("%d\n%d\n", cont1, cont2);

    return 0;
}
