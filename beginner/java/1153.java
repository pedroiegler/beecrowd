import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i, m = 1;

        n = scanner.nextInt();

        for(i = n; i >= 1; i--){
            m *= i;
        }

        System.out.printf("%d%n", m);
    }
}

