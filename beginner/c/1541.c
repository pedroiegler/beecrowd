#include <stdio.h>
#include <math.h>

int main (){

	double A, B, C, X;
	while (1) {
		scanf("%lf %lf %lf", &A, &B, &C);

		if(A == 0)
			break;

		X = sqrt((((A * B) / C) * 100.0));
		printf("%d\n", (int)X);
	}
}