import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int codPeca1 = scanner.nextInt();
            int numPeca1 = scanner.nextInt();
            double valorPeca1 = scanner.nextDouble();

            int codPeca2 = scanner.nextInt();
            int numPeca2 = scanner.nextInt();
            double valorPeca2 = scanner.nextDouble();

            double total = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }
}