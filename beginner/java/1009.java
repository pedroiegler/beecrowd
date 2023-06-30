import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            String nome = scanner.nextLine();
            double salarioFixo = scanner.nextDouble();
            double totalVendas = scanner.nextDouble();

            double valorGanho = salarioFixo + (totalVendas * 0.15);

            System.out.printf("TOTAL = R$ %.2f%n", valorGanho);

        scanner.close();
    }
}