import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            double valorFigurinha = scanner.nextDouble();
            int numIntegrantes = scanner.nextInt();

            double valorPorIntegrante = valorFigurinha / numIntegrantes;
            System.out.printf("%.2f%n", valorPorIntegrante);
        }

        scanner.close();
    }
}
