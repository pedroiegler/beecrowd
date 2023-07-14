import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n;
        double quadrado;

        n = scanner.nextInt();

        for(i = 1; i <= n; i++){
            if(i % 2 == 0){
                quadrado = (int) Math.pow(i,2);
                System.out.printf("%d^2 = %.0f\n", i, quadrado);
            }
        }

        scanner.close();

    }
}

