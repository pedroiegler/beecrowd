#include <stdio.h>
int main(){

    int n, i, c, d, e, f;

    scanf("%d", &n);

    for(i = 1; i <= n; i++){

        c=i*i;
        d=i*i*i;

        printf("%d %d %d\n",i,c,d);

        e=c+1;
        f=d+1;
        
        printf("%d %d %d\n",i,e,f);
    }
    return 0;
}