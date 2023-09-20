#include <stdio.h>
#include <string.h>

int main() {
    int caso = 1;
    while (1) {
        char n1[101], n2[101];
        
        if (scanf("%s", n1) == EOF || scanf("%s", n2) == EOF)
            break;
        
        printf("Caso #%d:\n", caso);
        int qt = 0;
        int len1 = strlen(n1);
        int len2 = strlen(n2);
        
        for (int i = 0; i < len2; i++) {
            if (n2[i] == n1[0]) {
                int j;
                for (j = 1; j < len1; j++) {
                    if (i + j >= len2 || n2[i + j] != n1[j])
                        break;
                }
                if (j == len1)
                    qt++;
            }
        }
        
        if (qt == 0) {
            printf("Nao existe subsequencia\n");
        } else {
            printf("Qtd.Subsequencias: %d\n", qt);
            int lastPos = -1;
            for (int i = 0; i < len2; i++) {
                if (n2[i] == n1[0]) {
                    int j;
                    for (j = 1; j < len1; j++) {
                        if (i + j >= len2 || n2[i + j] != n1[j])
                            break;
                    }
                    if (j == len1)
                        lastPos = i;
                }
            }
            
            if (lastPos != -1)
                printf("Pos: %d\n", lastPos + 1);
        }
        
        printf("\n");
        caso++;
    }
    
    return 0;
}
