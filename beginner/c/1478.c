#include <stdio.h>

int main (){

	unsigned short int tamanho = 1, linha, coluna;

	while (tamanho != 0){

		scanf("%hd", &tamanho);
		short matriz[tamanho][tamanho];

		for(linha = 0; linha < tamanho; linha++)
			for(coluna = 0; coluna < tamanho; coluna++){
				if (linha == coluna)
					matriz[linha][coluna] = 1;
				if (linha < coluna)
					matriz[linha][coluna] = coluna - linha + 1;
				if (linha > coluna)
					matriz[linha][coluna] = linha - coluna + 1;
			}

		for (linha = 0; linha < tamanho; linha++){
			for (coluna = 0; coluna < tamanho; coluna++){
				if (coluna == 0)
					printf("%3hd", matriz[linha][coluna]);
				else
					printf(" %3hd", matriz[linha][coluna]);
			}
			printf("\n");
		}
		printf("\n");
	}
}