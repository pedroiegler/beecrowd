import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, a = 0, b = 1, c = 0;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        for (y = 1; y < x; y++) {
            if (y % 2 == 1) {
                System.out.print(c + " ");
                c = a + b;
                a = c;
            } else if (y == 2) {
                System.out.print(c + " ");
            } else if (y % 2 == 0) {
                System.out.print(c + " ");
                c = a + b;
                b = c;
            }
        }
        System.out.println(c);
        scanner.close();
    }
}
