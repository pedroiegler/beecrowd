import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i;

        n = scanner.nextInt();

        for(i = 1; i <= n; i++){
            if(i == n)
            System.out.printf("Ho!%n");
            else
            System.out.printf("Ho ");
        }

        scanner.close();
    }
}
