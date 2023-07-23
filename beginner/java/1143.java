import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n, x = 0, cont = 0;

        n = scanner.nextInt();

        for(i = 1; i <= n; i++){
            x+=i;
            System.out.printf("%d ", x);
            x*=i;
            System.out.printf("%d ", x);
            x*=i;
            System.out.printf("%d\n", x);
            x = 0;

        }
    }
}

