import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        String bandido;

        n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            bandido = scanner.next();
            System.out.printf("Y%n");
        }
    }
}
