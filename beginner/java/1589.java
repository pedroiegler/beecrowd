import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a, b, i, n;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.printf("%d%n", a+b);
        }
    }
	
}