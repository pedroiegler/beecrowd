#include <stdio.h>
int main(){

    int i; 
    double s = 0.0, n = 100.0;

    for(i = 1; i <= n; i++){
        s = s + (1.0/i);
    }

    printf("%.2lf\n", s);

    return 0;
}