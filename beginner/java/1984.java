import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            while (n != 0) {
                long i = n % 10;
                n = n / 10;
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
