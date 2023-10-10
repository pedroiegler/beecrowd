import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int i, n, s, b, a, s1, b1, a1, somaS = 0, somaS1 = 0, somaB = 0, somaB1 = 0, somaA = 0, somaA1 = 0;
        float pontosS, pontosB, pontosA;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            nome = scanner.nextLine();
            scanner.nextLine();

            s = scanner.nextInt();
            b = scanner.nextInt();
            a = scanner.nextInt();

            s1 = scanner.nextInt();
            b1 = scanner.nextInt();
            a1 = scanner.nextInt();

            somaS += s;
            somaS1 += s1;
            somaB += b;
            somaB1 += b1;
            somaA += a;
            somaA1 += a1;

        }

        pontosS = (float) (somaS1 * 100.0) / somaS;
        pontosB = (float) (somaB1 * 100.0) / somaB;
        pontosA = (float) (somaA1 * 100.0) / somaA;

        System.out.printf("Pontos de Saque: %.2f %%.%n", pontosS);
        System.out.printf("Pontos de Bloqueio: %.2f %%.%n", pontosB);
        System.out.printf("Pontos de Ataque: %.2f %%.%n", pontosA);


        scanner.close();
    }
}
