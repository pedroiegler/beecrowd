#include <stdio.h>
#include <stdbool.h>

int main() {

    int n1, n2;

    while(true){
        scanf("%d %d", &n1, &n2);

        if(n1 == n2)
            break;
        else if(n1 > n2)
            printf("Decrescente\n");
        else
            printf("Crescente\n");
    }

    return 0;
}
