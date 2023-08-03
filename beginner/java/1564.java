import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short n;

        while (scanner.hasNextShort()) {
            n = scanner.nextShort();
            if (n == 0)
                System.out.println("vai ter copa!");
            else
                System.out.println("vai ter duas!");
        }

        scanner.close();
    }
}
