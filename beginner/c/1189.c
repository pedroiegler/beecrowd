#include <stdio.h>

int main() {

  double m[12][12], soma = 0.0;
  int i, j, cont = 0, p = 0, r = 4;
  char operacao;

  scanf(" %c", &operacao);

  for (i = 0; i < 12; i++) {
    for (j = 0; j < 12; j++) {
      scanf("%lf", &m[i][j]);
    }
  }

  for(i = 1; i < 11; i++){
    if(i <= 5){
      for(j = 0; j <= p; j++)
          soma += m[i][j];
          cont++;
      p++;
    }
    else if(i >= 6){
      for(j = 0; j <= r; j++)
          soma += m[i][j];
          cont++;
      r--;
    }
  }
  
  if (operacao == 'S') {
    printf("%.1lf\n", soma);
  } else {
    printf("%.1lf\n", soma / cont);
  }

  return 0;
}
