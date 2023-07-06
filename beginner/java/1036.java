import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            scanner.useLocale(Locale.US);

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double delta = Math.pow(b,2) - 4 * a * c;

            if(a == 0 || delta < 0){
                System.out.printf("Impossivel calcular%n");
            } else{
                double R1 = (-b + Math.sqrt(delta)) / (2 * a);
                double R2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("R1 = %.5f%n", R1);
                System.out.printf("R2 = %.5f%n", R2);
            }
    

        scanner.close();
    }
}
