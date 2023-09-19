#include <stdio.h>
#include <string.h>

int main() {
    
    int n, m, i;
    char s[10];

    scanf("%d %d", &n, &m);

    for(i = 0; i < m; i++){
        scanf("%s", s);

        if(strcmp(s,"fechou") == 0)
            n+=1;
        else
            n-=1;
    }

    printf("%d\n", n);

    return 0;
}
