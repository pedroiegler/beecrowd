import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float perimetro = a + b + c;
        float area = (a + b) * c / 2;

        if((a < (b + c)) && (b < (a + c)) && (c < (a + b))){
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else{
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
