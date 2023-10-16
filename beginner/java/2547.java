import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, nn, nm, i, cont, x;

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            nn = scanner.nextInt();
            nm = scanner.nextInt();

            cont = 0;
            for (i = 0; i < n; i++) {
                x = scanner.nextInt();
                if (x >= nn && x <= nm)
                    cont++;
            }
            System.out.printf("%d%n", cont);
        }

    }
}
