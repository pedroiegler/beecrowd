n = int(input())

for i in range(0,n):
    value = int(input())

    if(value >= 2015):
        print("%d A.C." % (value-2014))
    else:
        print("%d D.C." % (2015-value))
    
