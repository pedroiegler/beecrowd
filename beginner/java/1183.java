import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] m = new double[12][12];
        double soma = 0.0;
        char operacao;
        int i, j;

        Scanner scanner = new Scanner(System.in);

        operacao = scanner.next().charAt(0);

        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }

        int elementos_acima_diagonal = 0;
        for (i = 0; i < 12; i++) {
            for (j = i + 1; j < 12; j++) { 
                soma += m[i][j];
                elementos_acima_diagonal++;
            }
        }

        if (operacao == 'S') {
            System.out.printf("%.1f%n", soma);
        } else if (operacao == 'M') {
            System.out.printf("%.1f%n", soma / elementos_acima_diagonal);
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
