#include <stdio.h>

int main (){

  unsigned short hora, minuto, resultado = 0;
  char ponto;

  while (scanf("%hd%c%hd", &hora, &ponto, &minuto) != EOF){

    if (hora >= 5 && hora <= 6)
      printf("Atraso maximo: %hu\n", 0);
    else if (hora == 7)
      printf("Atraso maximo: %hu\n", minuto);
    else if (hora == 8)
      printf("Atraso maximo: %hu\n", 60+minuto);
    else if (hora == 9)
      printf("Atraso maximo: %hu\n", 120+minuto);

    }
}