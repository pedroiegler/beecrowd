import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextShort()) {
            short tamanho = scanner.nextShort();
            matrix(tamanho);
        }
    }

    public static void matrix(short tamanho) {
        int[][] m = new int[tamanho][tamanho];
        short linha, coluna;

        for (linha = 0; linha < tamanho; linha++) {
            for (coluna = 0; coluna < tamanho; coluna++) {
                if (linha == coluna)
                    m[linha][coluna] = 2;
                else if (linha == tamanho - coluna - 1)
                    m[linha][coluna] = 3;
                else
                    m[linha][coluna] = 0;
            }
        }

        short inicio = (short) (tamanho / 3);
        short fim = (short) (tamanho - inicio);

        for (linha = inicio; linha < fim; linha++) {
            for (coluna = inicio; coluna < fim; coluna++) {
                m[linha][coluna] = 1;
            }
        }

        m[tamanho / 2][tamanho / 2] = 4;

        for (linha = 0; linha < tamanho; linha++) {
            for (coluna = 0; coluna < tamanho; coluna++) {
                System.out.print(m[linha][coluna]);
            }
            System.out.println();
        }
        
        System.out.println();
    }
}
