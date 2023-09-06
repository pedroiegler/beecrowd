#include <stdio.h>
 
int main() {
 
    int n, i, v, cont = 0;
    
    scanf("%d", &n);
    
    for(i = 0; i < 5; i++){
        scanf("%d", &v);
        if(v == n)
            cont++;
    }
    
    printf("%d\n", cont);
 
    return 0;
}