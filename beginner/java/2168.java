import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] cameras = new int[N + 1][N + 1];
        char[][] quadras = new char[N][N];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                cameras[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int camerasAtivadas = cameras[i][j] + cameras[i][j + 1] + cameras[i + 1][j] + cameras[i + 1][j + 1];
                if (camerasAtivadas >= 2) {
                    quadras[i][j] = 'S';
                } else {
                    quadras[i][j] = 'U';
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(quadras[i][j]);
            }
            System.out.println();
        }
    }
}
