#include <stdio.h>

int main() {

  unsigned short int i, j, n, value, iniMatriz, fimMatriz;

  while(1){
    scanf("%hd", &n);

    if(n == 0)
      return 0;
    
    iniMatriz = 0;
	  fimMatriz = n;
    value = 1;

    short m[n][n];

    while(1){
      for(i = iniMatriz; i < fimMatriz; i++)
        for(j = iniMatriz; j < fimMatriz; j++)
            m[i][j] = value;
        
      if(fimMatriz == 0)
        break;
      
      fimMatriz--;
      iniMatriz++;
      value++;
    }

    for (i = 0; i < n; i++){
			for (j = 0; j < n; j++){
				if (j == 0)
					printf("%3hd", m[i][j]);
				else
					printf(" %3hd", m[i][j]);
			}
			printf("\n");
		}

		printf("\n");
  }

  return 0;
}
