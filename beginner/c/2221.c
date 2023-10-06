#include <stdio.h>

int main() {

    int n, i, bonus, at1, at2, df1, df2, lvl1, lvl2;

    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d", &bonus);
        scanf("%d %d %d", &at1, &df1, &lvl1);
        scanf("%d %d %d", &at2, &df2, &lvl2);

        int golpe1 = ((at1 + df1) / 2);
        int golpe2 = ((at2 + df2) / 2);

        if(lvl1 % 2 == 0)
            golpe1 += bonus;
        if(lvl2 % 2 == 0)
            golpe2 += bonus;

        if(golpe1 > golpe2)
            printf("Dabriel\n");
        else if(golpe2 > golpe1)
            printf("Guarte\n");
        else
            printf("Empate\n");

    }

    return 0;
}
