#include <stdio.h>

int main (){

	unsigned short int n, i, j;
 	int elemento;

	while (1){

		scanf("%hd", &n);

		if (n == 0)
			return 0;

		int m[n][n];

		elemento = 1;

		for (i = 0; i < n; i++){
			for (j = 0; j < n; j++){
				m[i][j] = elemento;
				elemento *= 2;
			}
			elemento = (m[i][0]) * 2;
		}

		unsigned short int digitos = 0;
		int t;

		t = (m[n - 1][n - 1]);

		do{

			t % 10;
			t = t/10;
			digitos++;

		} while (t > 0);

		for (i = 0; i < n; i++){
			for (j = 0; j < n; j++){
				if (j == 0)
					printf("%*d", digitos, m[i][j]);
				else
					printf(" %*d", digitos, m[i][j]);
			}

			printf("\n");
		}

		printf("\n");

	}
}