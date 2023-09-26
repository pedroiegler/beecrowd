import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        while(scanner.hasNext()){
            n = scanner.nextInt();
            System.out.printf("%d%n", n-1);
        }
        

        scanner.close();
    }
}
