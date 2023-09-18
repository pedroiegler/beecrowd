#include <stdio.h>

int main() {
    int i, n, value, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d", &value);

        if(value % 2 == 0)
            cont2++;
        if(value % 3 == 0)
            cont3++;
        if(value % 4 == 0)
            cont4++;
        if(value % 5 == 0)
            cont5++;
    }

    printf("%d Multiplo(s) de 2\n", cont2);
    printf("%d Multiplo(s) de 3\n", cont3);
    printf("%d Multiplo(s) de 4\n", cont4);
    printf("%d Multiplo(s) de 5\n", cont5);

    return 0;
}
