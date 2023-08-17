#include <stdio.h>
#include <string.h>

int main() {
    int i, n, x;
    char name[50];

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%s %d", name, &x);

        if(strcmp(name, "Thor") == 0)
            printf("Y\n");
        else
            printf("N\n");
    }

    return 0;
}
