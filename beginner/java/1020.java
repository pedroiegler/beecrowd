import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            int idade = scanner.nextInt();

            int ano = idade / 365;
            int resto = idade % 365;
            int mes = resto / 30;
            int dias = resto % 30;

            System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);


        scanner.close();
    }
}
