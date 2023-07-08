import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float x, y;

        x = scanner.nextFloat();
        y = scanner.nextFloat();

        if (x + y == 0) System.out.printf("Origem\n");
        else if (x == 0) System.out.printf("Eixo Y\n");
        else if (y == 0) System.out.printf("Eixo X\n");
        else if (x>0 && y>0) System.out.printf("Q1\n");
        else if (x<0 && y>0) System.out.printf("Q2\n");
        else if (x<0 && y<0) System.out.printf("Q3\n");
        else if (x>0 && y<0) System.out.printf("Q4\n");

        scanner.close();
    }
}

