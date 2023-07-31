import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, menor = 0, posicao = 0;

        n = scanner.nextInt();

        int[] v = new int[n];

        for (i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
            if (i == 0 || v[i] < menor) {
                menor = v[i];
                posicao = i;
            }
        }

        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", posicao);
        
        scanner.close();
    }
}
