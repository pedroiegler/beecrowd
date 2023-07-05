import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int n = scanner.nextInt();

            int n100 = n / 100;
            int n1resto = n % 100;
            int n50 = n1resto / 50;
            int n2resto = n1resto % 50;
            int n20 = n2resto / 20;
            int n3resto = n2resto % 20;
            int n10 = n3resto / 10;
            int n4resto = n3resto % 10;
            int n5 = n4resto / 5;
            int n5resto = n4resto % 5;
            int n2 = n5resto / 2;
            int n6resto = n5resto % 2;
            int n1 = n6resto / 1;

            System.out.printf("%d\n%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n", n, n100, n50, n20, n10, n5, n2, n1); 

        scanner.close();
    }
}
