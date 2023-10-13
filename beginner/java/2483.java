import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;

        n = scanner.nextInt();

        System.out.print("Feliz nat");

        for(int i = 0; i < n; i++){
            System.out.print("a");
        }

        System.out.println("l!");

        scanner.close();
    }
}
