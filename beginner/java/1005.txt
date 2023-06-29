import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();

            double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

            System.out.printf("MEDIA = %.5f%n", media);


        scanner.close();
    }
}