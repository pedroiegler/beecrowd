import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int p = scanner.nextInt();
            
            if (p == -1) {
                break;
            } else {
                if (p <= 1) {
                    System.out.println("0");
                } else {
                    System.out.println(p - 1);
                }
            }
        }
        
        scanner.close();
    }
}
