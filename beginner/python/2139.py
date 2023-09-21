while True:
    try: 
        mes, dia = list(map(int, input().split()))
        
        dias_no_mes = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25]

        if (mes == 12 and dia == 25):
            print("E natal!")
        elif (mes == 12 and dia == 24): 
            print("E vespera de natal!")
        elif (mes == 12 and dia > 25):
            print("Ja passou!")
        else:
            dias_faltando = dias_no_mes[mes - 1] - dia
            for i in range(mes,12): 
                dias_faltando += dias_no_mes[i]
           
            print("Faltam %d dias para o natal!" % dias_faltando)
    except EOFError:
        break
   