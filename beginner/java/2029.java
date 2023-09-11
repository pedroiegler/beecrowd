import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double volume, diametro;

        while(scanner.hasNext()){
            volume = scanner.nextDouble();
            diametro = scanner.nextDouble();

            double altura = volume / (3.14 * Math.pow((diametro/2),2));
            double area = Math.pow((diametro/2),2) * 3.14;

            System.out.printf("ALTURA = %.2f%n", altura);
            System.out.printf("AREA = %.2f%n", area);
        }
    }
}
