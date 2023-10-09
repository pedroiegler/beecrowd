import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        if (a != b + c && b != a + c && c != a + b && a != b && a != c && b != c)
            System.out.printf("N%n");
        else
            System.out.printf("S%n");


        scanner.close();
    }
}
