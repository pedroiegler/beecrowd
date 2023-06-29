import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("PROD = " + (a*b));


        scanner.close();
    }
}