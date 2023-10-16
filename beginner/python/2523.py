while True:
    try:
        alfabeto = input()
        n = int(input())
        valores = input().split() 
        
        for i in range(n):
            n1 = int(valores[i])  
            for j in range(len(alfabeto)):
                letra = alfabeto[j]
                
                if(i == n-1):
                    if(j+1 == n1):
                        print(letra)
                else:
                    if(j+1 == n1):
                        print(letra, end="")
                
    except EOFError:
        break
