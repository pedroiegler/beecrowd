import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] album = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            album[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int figurinha = scanner.nextInt();
            album[figurinha] = 1;
        }

        int faltam = 0;
        for (int i = 1; i <= N; i++) {
            if (album[i] == 0) {
                faltam++; 
            }
        }

        System.out.println(faltam);

        scanner.close();
    }
}
