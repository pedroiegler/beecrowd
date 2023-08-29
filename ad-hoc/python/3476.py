def calculate_sbc_time(S, B, C):
    rate_s = 1 / S
    rate_b = 1 / B
    rate_c = 1 / C
    
    rate_sbc = rate_s + rate_b + rate_c
    
    time_sbc = 1 / rate_sbc
    
    return time_sbc

S, B, C = map(int, input().split())

sbc_time = calculate_sbc_time(S, B, C)
print("{:.3f}".format(sbc_time))
