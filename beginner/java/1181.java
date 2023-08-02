import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] m = new double[12][12];
        double soma = 0.0;
        int n;
        char operacao;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        operacao = scanner.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }

        if (operacao == 'S') {
            for (int j = 0; j < 12; j++) {
                soma += m[n][j];
            }
            System.out.printf("%.1f\n", soma);
        } else if (operacao == 'M') {
            for (int j = 0; j < 12; j++) {
                soma += m[n][j];
            }
            System.out.printf("%.1f\n", soma / 12);
        }

        /*for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.1f\t", m[i][j]);
            }
            System.out.println();
        }*/

        scanner.close();
    }
}
