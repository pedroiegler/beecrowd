import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, a, b;

        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        if((a + b) > n)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");

        scanner.close();
    }
}
