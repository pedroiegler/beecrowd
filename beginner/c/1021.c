#include <stdio.h>
#include <math.h>

int main() {
    
    double valorInformado;
    int valor;

    scanf("%lf", &valorInformado);

    printf("NOTAS:\n");

    valor = (int) (valorInformado / 100);
    printf("%d nota(s) de R$ 100.00\n", valor);
    valorInformado = fmod(valorInformado, 100);

    valor = (int) (valorInformado / 50);
    printf("%d nota(s) de R$ 50.00\n", valor);
    valorInformado = fmod(valorInformado, 50);

    valor = (int) (valorInformado / 20);
    printf("%d nota(s) de R$ 20.00\n", valor);
    valorInformado = fmod(valorInformado, 20);

    valor = (int) (valorInformado / 10);
    printf("%d nota(s) de R$ 10.00\n", valor);
    valorInformado = fmod(valorInformado, 10);

    valor = (int) (valorInformado / 5);
    printf("%d nota(s) de R$ 5.00\n", valor);
    valorInformado = fmod(valorInformado, 5);

    valor = (int) (valorInformado / 2);
    printf("%d nota(s) de R$ 2.00\n", valor);
    valorInformado = fmod(valorInformado, 2);

    valorInformado *= 100;
    printf("MOEDAS:\n");

    valor = (int) (valorInformado / 100);
    printf("%d moeda(s) de R$ 1.00\n", valor);
    valorInformado = fmod(valorInformado, 100);

    valor = (int) (valorInformado / 50);
    printf("%d moeda(s) de R$ 0.50\n", valor);
    valorInformado = fmod(valorInformado, 50);

    valor = (int) (valorInformado / 25);
    printf("%d moeda(s) de R$ 0.25\n", valor);
    valorInformado = fmod(valorInformado, 25);

    valor = (int) (valorInformado / 10);
    printf("%d moeda(s) de R$ 0.10\n", valor);
    valorInformado = fmod(valorInformado, 10);

    valor = (int) (valorInformado / 5);
    printf("%d moeda(s) de R$ 0.05\n", valor);
    valorInformado = fmod(valorInformado, 5);

    valor = (int) (valorInformado / 1);
    printf("%d moeda(s) de R$ 0.01\n", valor);
    valorInformado = fmod(valorInformado, 1);

    return 0;
}

