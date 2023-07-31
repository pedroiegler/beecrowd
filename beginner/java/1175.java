import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
    
        int i, temp;
        int[] n = new int[20];

        for (i = 0; i < 20; i++) {
            n[i] = scanner.nextInt();
        }

        for (i = 0; i < 10; i++) {
            temp = n[i];
            n[i] = n[19 - i];
            n[19 - i] = temp;
        }

        for (i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d%n", i, n[i]);
        }

    }
}

