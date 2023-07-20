import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double n1 = 0, n2 = 0, media;
        int nota_valida = 0;

        while (nota_valida != 1){
            n1 = scanner.nextDouble();
            if(n1 < 0.0 || n1 > 10.0)
                System.out.printf("nota invalida%n");
            else
                nota_valida+=1;
        }

        nota_valida = 0;

        while (nota_valida != 1){
            n2 = scanner.nextDouble();
            if(n2 < 0.0 || n2 > 10.0)
                System.out.printf("nota invalida%n");
            else
                nota_valida+=1;
        }

        media = (n1 + n2) / 2.0;

        System.out.printf("media = %.2f%n", media);

        scanner.close();

    }
}

