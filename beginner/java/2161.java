import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double ans = 0.0;
        
        while (n-- > 0) {
            ans += 6.0;
            ans = 1.0 / ans;
        }
        
        ans += 3.0;
        System.out.printf("%.10f%n", ans);
        
        scanner.close();
    }
}
