import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int x = scanner.nextInt();
            double y = scanner.nextDouble();

            double n = x / y;

            System.out.printf("%.3f km/l%n", n);

        scanner.close();
    }
}
