import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i;
        double media, n1, n2, n3;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            n3 = scanner.nextDouble();

            media = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);

            System.out.printf("%.1f\n", media);
        }

        scanner.close();

    }
}

