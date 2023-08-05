#include <stdio.h>

int main (){

  double m[12][12], soma = 0.0;
  int i, j, cont = 0, aux = 5, coluna = 7;
  char operacao;

  scanf(" %c", &operacao);

  for(i = 0; i < 12; i++){
    for(j = 0; j < 12; j++){
      scanf("%lf", &m[i][j]);
    }
  }

  for(i = 7; i < 12; i++){
    for(j = aux; j < coluna; j++){
        soma += m[i][j];
        cont++;
    }
    coluna++;
    aux--;
  }

  if(operacao == 'S'){
    printf("%.1lf\n", soma);
  } else{
    printf("%.1lf\n", soma/cont);
  }


}