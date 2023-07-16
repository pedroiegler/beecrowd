#include <stdio.h>
int main(){

    int n, i;
    double media, n1, n2, n3;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%lf %lf %lf", &n1, &n2, &n3);

        media = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);

        printf("%.1lf\n", media);
    }


    return 0;
    
}