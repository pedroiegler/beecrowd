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
            
            double pi = 3.14159;

            double areaTriangulo = (a*c) / 2;
            double areaCirculo = pi * Math.pow(c,2);
            double areaTrapezio = ((a + b) * c) / 2;
            double areaQuadrado = Math.pow(b,2);
            double areaRetangulo = a * b;

            System.out.printf("TRIANGULO: %.3f%n" +
                            "CIRCULO: %.3f%n" +
                            "TRAPEZIO: %.3f%n" +
                            "QUADRADO: %.3f%n" +
                            "RETANGULO: %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        scanner.close();
    }
}
