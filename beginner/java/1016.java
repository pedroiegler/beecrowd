import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int n = scanner.nextInt();

            int x = n * 2;

            System.out.printf("%d minutos%n", x);

        scanner.close();
    }
}
