import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        System.out.printf("%.2f%n", (float) n1 / n2);

        scanner.close();
    }
}
