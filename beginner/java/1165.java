import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num;
            num = scanner.nextInt();

            int s = 0;
            int j = 1;

            while (j <= num) {
                if (num % j == 0) {
                    s = s + 1;
                }
                j = j + 1;
            }

            if (s > 2) {
                System.out.printf("%d nao eh primo\n", num);
            } else {
                System.out.printf("%d eh primo\n", num);
            }
        }

    }
}

