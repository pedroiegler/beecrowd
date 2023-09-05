#include <stdio.h>

int main() {

    int i, n, index;
    double value, soma = 0;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d %lf", &index, &value);

        if(index == 1001){
            value *= 1.50;
            soma += value;
        } else if(index == 1002){
            value *= 2.50;
            soma += value;
        } else if(index == 1003){
            value *= 3.50;
            soma += value;
        } else if(index == 1004){
            value *= 4.50;
            soma += value;
        } else if(index == 1005){
            value *= 5.50;
            soma += value;
        }
    }

    printf("%.2lf\n", soma);

    return 0;
}
