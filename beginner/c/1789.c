#include <stdio.h>

int main (){

	unsigned short int n, i, maior, x, result;

	while(scanf("%hd", &n) != EOF){

		for(i = 0; i < n; i++){
			scanf("%hd", &x);

			if(i == 0)
				maior = x;
			
			if(x > maior)
				maior = x;



			if(maior < 10)
				result = 1;
			
			if(maior >= 10 && maior < 20)
				result = 2;
			
			if(maior >= 20)
				result = 3;
		
		}

		printf("%hd\n", result);
	}
}