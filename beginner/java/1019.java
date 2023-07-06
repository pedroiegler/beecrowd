import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int tempo = scanner.nextInt();

            int hora = tempo / 3600;
            int resto = tempo % 3600;
        
            int minutos = resto / 60;
            int segundos = resto % 60;

            System.out.printf("%d:%d:%d%n", hora, minutos, segundos);

        scanner.close();
    }
}
