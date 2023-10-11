import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(b + c > a && a + c > b && a + b > c){
            System.out.printf("Valido-");
            if (a == b && b == c) {
                System.out.printf("Equilatero%n");
            } else if (a == b || b == c || a == c) {
                System.out.printf("Isoceles%n");
            } else {
                System.out.printf("Escaleno%n");
            }

            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.printf("Retangulo: S%n");
            } else {
                System.out.printf("Retangulo: N%n");
            }
        }
        else{
            System.out.printf("Invalido%n");
        }
        scanner.close();
    }
}
