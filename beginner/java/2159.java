import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        double result1 = n / Math.log(n);
        double result2 = 1.25506 * n / Math.log(n);
        
        System.out.printf("%.1f %.1f%n", result1, result2);
    }
}