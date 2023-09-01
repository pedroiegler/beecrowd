import java.util.Scanner;

public class SomaPA {
    public static int somaPA(int an) {
        return (an * (an + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 1;

        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            System.out.printf("Caso %d: %d número%s\n", k++, somaPA(N) + 1, N == 0 ? "" : "s");

            System.out.print("0");
            for (int i = 1; i <= N; ++i) {
                for (int j = 0; j < i; ++j) {
                    System.out.printf(" %d", i);
                }
            }
            System.out.println("\n");
        }

        scanner.close();
    }
}
