import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            double valorInformado = scanner.nextDouble();
            int valor = 0;

            System.out.println("NOTAS:");

            valor = (int) valorInformado / 100;
            System.out.printf("%d nota(s) de R$ 100.00%n", valor);
            valorInformado = valorInformado % 100;

            valor = (int) valorInformado / 50;
            System.out.printf("%d nota(s) de R$ 50.00%n", valor);
            valorInformado = valorInformado % 50;

            valor = (int) valorInformado / 20;
            System.out.printf("%d nota(s) de R$ 20.00%n", valor);
            valorInformado = valorInformado % 20;

            valor = (int) valorInformado / 10;
            System.out.printf("%d nota(s) de R$ 10.00%n", valor);
            valorInformado = valorInformado % 10;

            valor = (int) valorInformado / 5;
            System.out.printf("%d nota(s) de R$ 5.00%n", valor);
            valorInformado = valorInformado % 5;

            valor = (int) valorInformado / 2;
            System.out.printf("%d nota(s) de R$ 2.00%n", valor);
            valorInformado = valorInformado % 2;

            valorInformado *= 100;
            System.out.println("MOEDAS:");

            valor = (int) valorInformado / 100;
            System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
            valorInformado = valorInformado % 100;

            valor = (int) valorInformado / 50;
            System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
            valorInformado = valorInformado % 50;

            valor = (int) valorInformado / 25;
            System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
            valorInformado = valorInformado % 25;

            valor = (int) valorInformado / 10;
            System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
            valorInformado = valorInformado % 10;

            valor = (int) valorInformado / 5;
            System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
            valorInformado = valorInformado % 5;

            valor = (int) valorInformado / 1;
            System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
            valorInformado = valorInformado % 1;

        scanner.close();
    }
}
