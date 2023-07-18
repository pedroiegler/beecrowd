import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, j;

        for (i = 1, j = 7; i <= 9; j--) {
            System.out.printf("I=%d J=%d%n", i, j);

            if (j == 5) {
                i += 2;
                j = 8;
            }
        }

        scanner.close();

    }
}
