#include <stdio.h>

int main (){

	unsigned short int n, i, j;

	while (scanf("%hd", &n) != EOF){
		short m[n][n];

		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
			{
				if (i == j)
					m[i][j] = 1;
				if (i == n - j - 1)
					m[i][j] = 2;
				if (i != j && i != n - j - 1)
					m[i][j] = 3;
			}

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
				printf("%d", m[i][j]);

			printf("\n");
		}
	}
}