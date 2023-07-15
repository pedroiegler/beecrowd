import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n;

        n = scanner.nextInt();
        for(i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i, n, i*n);
        }

        scanner.close();

    }
}

