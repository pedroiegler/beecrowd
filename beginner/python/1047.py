a,c,b,d=list(map(int,input().split()))

dif=((b*60)+d)-((a*60)+c)
if(dif<=0):
    dif+=24*60
    
time=dif//60
minute=dif%60
print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % (time,minute))