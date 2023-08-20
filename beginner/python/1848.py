sum = 0

while True:
    crow = input()
    
    if crow == "caw caw":
        print(sum)
        sum = 0
    else:
        if crow == "--*":
            sum += 1
        if crow == "-*-":
            sum += 2
        if crow == "*--":
            sum += 4
        if crow == "---":
            sum += 0
        if crow == "***":
            sum += 7
        if crow == "**-":
            sum += 6
        if crow == "-**":
            sum += 3
        if crow == "*-*":
            sum += 5
