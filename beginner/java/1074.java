import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i, x;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            x = scanner.nextInt();

            if(x == 0)
                System.out.println("NULL");
            else if(x > 0 && x % 2 == 0)
                System.out.println("EVEN POSITIVE");
            else if(x > 0 && x % 2 != 0)
                System.out.println("ODD POSITIVE");
            else if(x < 0 && x % 2 == 0)
                System.out.println("EVEN NEGATIVE");
            else if(x < 0 && x % 2 != 0)
                System.out.println("ODD NEGATIVE");
        }

        scanner.close();

    }
}

