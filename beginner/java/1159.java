import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int x, soma, cont;

        while (true) {
            soma = 0;
            cont = 0;
            x = scanner.nextInt();

            if (x == 0)
                break;

            while (cont < 5) {
                if (x % 2 == 0) {
                    soma += x;
                    cont++;
                }
                x++;
            }

            System.out.println(soma);
        }
    }
}

