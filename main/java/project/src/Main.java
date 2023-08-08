import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho = 1, linha, coluna;

        while (tamanho != 0){

            tamanho = scanner.nextInt();
            int[][] matriz = new int[tamanho][tamanho];

            for(linha = 0; linha < tamanho; linha++)
                for(coluna = 0; coluna < tamanho; coluna++){
                    if (linha == coluna)
                        matriz[linha][coluna] = 1;
                    if (linha < coluna)
                        matriz[linha][coluna] = coluna - linha + 1;
                    if (linha > coluna)
                        matriz[linha][coluna] = linha - coluna + 1;
                }

            for (linha = 0; linha < tamanho; linha++){
                for (coluna = 0; coluna < tamanho; coluna++){
                    if (coluna == 0)
                        System.out.printf("%3hd", matriz[linha][coluna]);
                    else
                        System.out.printf(" %3hd", matriz[linha][coluna]);
                }
                System.out.printf("%n");
            }
            System.out.printf("%n");
        }
    }
}
