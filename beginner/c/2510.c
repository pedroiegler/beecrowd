#include <stdio.h>

int main() {
    int n;
    char bandido[100];

    scanf("%d", &n);

    for(int i = 0; i < n; i++){
        scanf("%s", bandido);
        printf("Y\n");
    }

    return 0;
}
