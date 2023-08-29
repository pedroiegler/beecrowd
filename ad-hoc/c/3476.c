#include <stdio.h>

float calculate_sbc_time(float S, float B, float C) {
    float rate_s = 1 / S;
    float rate_b = 1 / B;
    float rate_c = 1 / C;
    
    float rate_sbc = rate_s + rate_b + rate_c;
    
    float time_sbc = 1 / rate_sbc;
    
    return time_sbc;
}

int main() {
    float S, B, C;
    scanf("%f %f %f", &S, &B, &C);
    
    float sbc_time = calculate_sbc_time(S, B, C);
    printf("%.3f\n", sbc_time);
    
    return 0;
}
