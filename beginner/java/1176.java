import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long primeiro = 0, segundo = 1, prox = 0, n;
        int j = sc.nextInt();

        for (int i = 1; i <= j; i++, primeiro = 0, segundo = 1) {
            n = sc.nextLong();
            n = n + 1;

            for (long c = 0; c < n; c++) {
                if (c <= 1)
                    prox = c;
                else {
                    prox = primeiro + segundo;
                    primeiro = segundo;
                    segundo = prox;
                }
            }

            System.out.printf("Fib(%d) = %d%n", n - 1, prox);
        }

        sc.close();
    }
}
