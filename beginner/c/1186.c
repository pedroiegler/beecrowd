#include <stdio.h>

int main (){

  double m[12][12], soma = 0.0;
  int i, j, cont = 0;
  char operacao;

  scanf(" %c", &operacao);

  for(i = 0; i < 12; i++){
    for(j = 0; j < 12; j++){
      scanf("%lf", &m[i][j]);
    }
  }

  int coluna = 11;
  for(i = 0; i < 12; i++){
    for(j = coluna; j > coluna - i; j--){
        soma += m[i][j];
        cont++;
    }
  }

  if(operacao == 'S'){
    printf("%.1lf\n", soma);
  } else{
    printf("%.1lf\n", soma/cont);
  }


}