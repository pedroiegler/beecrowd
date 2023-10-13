import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;

        n = scanner.nextInt();

        if(n == 0)
            System.out.printf("E%n");
        else if(n >= 1 && n <= 35)
            System.out.printf("D%n");
        else if(n >= 36 && n <= 60)
            System.out.printf("C%n");
        else if(n >= 61 && n <= 85)
            System.out.printf("B%n");
        else if(n >= 86 && n <= 100)
            System.out.printf("A%n");

        scanner.close();
    }
}
