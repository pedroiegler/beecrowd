#include <stdio.h>

int main (){

	int n1, n2;

	while(1){
		scanf("%d %d", &n1, &n2);

		if(n1 == 0 & n2 == 0)
			break;
		else
			printf("%d\n", n1*n2);
	}

}