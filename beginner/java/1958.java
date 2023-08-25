import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextDouble();

        System.out.printf("%+.4E%n", numero);
    }
}
