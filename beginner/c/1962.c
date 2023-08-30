#include <stdio.h>

int main() {
    int n, i, value;

    scanf("%d", &n);
    
    for(i = 0; i < n; i++){
        scanf("%d", &value);

        if(value >= 2015){
            printf("%d A.C.\n", value-2014);
        } else{
            printf("%d D.C.\n", 2015-value);
        }
    }
    
    return 0;
}
