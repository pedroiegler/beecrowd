import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int a;
            int b; 

            a = scanner.nextInt();
            b = scanner.nextInt();

            var x = a + b;

            System.out.println("SOMA = " + x);


        scanner.close();
    }
}