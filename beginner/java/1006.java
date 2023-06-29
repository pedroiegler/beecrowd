import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double media = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10;

            System.out.printf("MEDIA = %.1f%n", media);


        scanner.close();
    }
}