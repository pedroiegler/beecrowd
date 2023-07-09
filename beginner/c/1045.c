#include <stdio.h>
#include <math.h>

int main(){

    double a, b, c, temp;

    scanf("%lf %lf %lf", &a, &b, &c);

    if(a < b){
        temp = a;
        a = b;
        b = temp;
    } 
    if(a < c){
        temp = a;
        a = c;
        c = temp;
    }
    if(b < c){
        temp = b;
        b = c;
        c = temp;
    }

    double powA = pow(a,2);
    double powB = pow(b,2);
    double powC = pow(c,2);

    if(a >= (b+c) || b >= (a+c) || c >= (a+b))
         printf("NAO FORMA TRIANGULO\n");
    else if(powA == (powB + powC) || powB == (powA + powC) || powC == (powA + powB))
           printf("TRIANGULO RETANGULO\n");
    else if(powA > (powB + powC) || powB > (powA + powC) || powC > (powA + powB))
           printf("TRIANGULO OBTUSANGULO\n");
    else if(powA < (powB + powC) || powB < (powA + powC) || powC < (powA + powB))
           printf("TRIANGULO ACUTANGULO\n");
    if(a == b && a == c)
            printf("TRIANGULO EQUILATERO\n");
    if((a == b && a != c)  || (a == c && a != b) || (b == c && b != a))
            printf("TRIANGULO ISOSCELES\n");

    return 0;
}
