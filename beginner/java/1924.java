import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        String ch;
        while (scanner.hasNextInt()) {
            m = scanner.nextInt();
            scanner.nextLine(); 
            for (int i = 0; i < m; i++) {
                ch = scanner.nextLine();
            }
            System.out.println("Ciencia da Computacao");
        }
    }
}
