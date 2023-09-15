p, j1, j2, r, a = list(map(int, input().split()))

soma = j1 + j2

if(p == 1):
    if(soma % 2 == 0):
        if(r == 0):
            if(a == 0 or a == 1):
                print("Jogador 1 ganha!")
            
        elif(r == 1):
            if(a == 0):
                print("Jogador 1 ganha!")
            elif(a == 1):
                print("Jogador 2 ganha!")
            
    else:
        if(r == 0):
                if(a == 0):
                    print("Jogador 2 ganha!")
                elif(a == 1):
                    print("Jogador 1 ganha!")
                
        elif(r == 1):
            if(a == 0):
                print("Jogador 1 ganha!")
            elif(a == 1):
                print("Jogador 2 ganha!")
                
            
elif(p == 0):
    if(soma % 2 != 0):
        if(r == 0):
            if(a == 0 or a == 1):
                print("Jogador 1 ganha!")
            
        elif(r == 1):
            if(a == 0):
                print("Jogador 1 ganha!")
            elif(a == 1):
                print("Jogador 2 ganha!")
       
    else: 
        if(r == 0):
            if(a == 0):
                print("Jogador 2 ganha!")
            elif(a == 1):
                print("Jogador 1 ganha!")
            
        elif(r == 1):
            if(a == 0):
                print("Jogador 1 ganha!")
            elif(a == 1):
                print("Jogador 2 ganha!")
            
          
   