import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double result = (Math.pow((((1 + Math.sqrt(5)) / 2)),n) - Math.pow((((1 - Math.sqrt(5)) / 2)),n)) / Math.sqrt(5);

        System.out.printf("%.1f%n", result);
        

        scanner.close();
    }
}
