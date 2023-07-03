import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int n = scanner.nextInt();
            int x = scanner.nextInt();

            double v = (n * x) / 12.0;

            System.out.printf("%.3f%n", v);

        scanner.close();
    }
}
