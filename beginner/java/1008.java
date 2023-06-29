import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int numFunc = scanner.nextInt();
            int horasTrab = scanner.nextInt();
            double valorGanho = scanner.nextDouble();

            double ganhoTotal = horasTrab * valorGanho;

            System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numFunc, ganhoTotal);

        scanner.close();
    }
}
