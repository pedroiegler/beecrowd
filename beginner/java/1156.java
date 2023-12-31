import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, x = 1; 
        double s = 0.0;

        for (i = 1; i <= 39; i += 2) {
            s = s + ((double) i / x);
            x *= 2; 
        }

        System.out.printf("%.2f%n", s);
    }
}

