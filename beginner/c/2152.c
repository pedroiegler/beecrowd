#include <stdio.h>
 
int main() {
 
    int n, i, h, m, o;
    
    scanf("%d", &n);
    
    for(i = 0; i < n; i++){
        scanf("%d %d %d", &h, &m, &o);
        
        if(h < 10 && m < 10){
            if(o == 1)
                printf("0%d:0%d - A porta abriu!\n", h, m);
            else
                printf("0%d:0%d - A porta fechou!\n", h, m);
        } else if(h < 10 && m >= 10){
            if(o == 1)
                printf("0%d:%d - A porta abriu!\n", h, m);
            else
                printf("0%d:%d - A porta fechou!\n", h, m);
        } else if(h >= 10 && m < 10){
            if(o == 1)
                printf("%d:0%d - A porta abriu!\n", h, m);
            else
                printf("%d:0%d - A porta fechou!\n", h, m);
        } else if(h >= 10 && m >= 10){
            if(o == 1)
                printf("%d:%d - A porta abriu!\n", h, m);
            else
                printf("%d:%d - A porta fechou!\n", h, m);
        }
    
    }
 
    return 0;
}
