#include <stdio.h>

int main(){

   int i;
   double n, v[100];

   scanf("%lf", &n);

   for(i = 0; i < 100; i++){
        v[i] = n;
        n /= 2;
   }

   for(i = 0; i < 100; i++){
        printf("N[%d] = %.4lf\n", i, v[i]);
   }
    

   return 0;
}
