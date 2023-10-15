#include <stdio.h>

int main() {
    int n, i, j, n1;
    char alfabeto[26];

    while (scanf("%s", alfabeto) != EOF){
        scanf("%d", &n);
        for(i = 0; i < n; i++){
            scanf("%d", &n1);

            for (j = 0; alfabeto[j] != '\0'; j++) { 
                char letra = alfabeto[j];

                if(i == n-1){
                    if(j+1 == n1)
                    printf("%c\n", letra);
                } else{
                    if(j+1 == n1)
                    printf("%c", letra);
                }
            }
        }
    }

    return 0;
}