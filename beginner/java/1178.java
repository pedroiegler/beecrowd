import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        double[] v = new double[100];
        double n;

        n = scanner.nextDouble();

        for(i = 0; i < 100; i++){
            v[i] = n;
            n /= 2;
        }

        for(i = 0; i < 100; i++){
            System.out.printf("N[%d] = %.4f%n", i, v[i]);
        }
    
        scanner.close();
    }
}
