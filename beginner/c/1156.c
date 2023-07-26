#include <stdio.h>

int main() {

    int i, x = 1; 
    double s = 0.0;

    for (i = 1; i <= 39; i += 2) {
        s = s + ((double) i / x);
        x *= 2; 
    }

    printf("%.2lf\n", s);

    return 0;
}
