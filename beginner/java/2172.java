import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        while(true){
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            if(n1 == 0 & n2 == 0)
                break;
            else
                System.out.printf("%d%n", n1*n2);
        }

        scanner.close();
    }
}
