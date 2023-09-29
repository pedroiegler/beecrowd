import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (matriz[i][j] == 42 &&
                    matriz[i - 1][j - 1] == 7 && matriz[i - 1][j] == 7 && matriz[i - 1][j + 1] == 7 &&
                    matriz[i][j - 1] == 7 && matriz[i][j + 1] == 7 &&
                    matriz[i + 1][j - 1] == 7 && matriz[i + 1][j] == 7 && matriz[i + 1][j + 1] == 7) {
                    System.out.printf("%d %d%n", i + 1, j + 1); 
                    return; 
                }
            }
        }

        System.out.printf("0 0%n");
        

        scanner.close();
    }
}
