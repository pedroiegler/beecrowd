import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            double pi = 3.14159;
            double raio = scanner.nextDouble();

            double volume = (4/3.0) * pi * Math.pow(raio,3);

            System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }
}