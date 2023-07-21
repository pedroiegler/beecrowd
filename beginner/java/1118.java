import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float n1 = 0, n2 = 0, media = 0;
        int nota_valida = 0, x = 1;

        do {
            while (nota_valida != 1) {
                n1 = scanner.nextFloat();
                if (n1 < 0.0 || n1 > 10.0)
                    System.out.printf("nota invalida%n");
                else
                    nota_valida = 1;
            }

            nota_valida = 0;

            while (nota_valida != 1) {
                n2 = scanner.nextFloat();
                if (n2 < 0.0 || n2 > 10.0)
                    System.out.printf("nota invalida%n");
                else
                    nota_valida = 1;
            }

            nota_valida = 0;

            media = (n1 + n2) / 2;

            System.out.printf("media = %.2f%n", media);

            do {
                System.out.printf("novo calculo (1-sim 2-nao)%n");
                x = scanner.nextInt();
            } while (x != 1 && x != 2);

        } while (x == 1);

        scanner.close();

    }
}

