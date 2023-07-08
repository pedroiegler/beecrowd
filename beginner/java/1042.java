import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x = a;
        int y = b;
        int z = c;
        int temp;

        if(x > y){
            temp = x;
            x = y;
            y = temp;
        }
        if(x > z){
            temp = x;
            x = z;
            z = temp;
        }
        if(y > z){
            temp = y;
            y = z;
            z = temp;
        }

        System.out.printf("%d%n%d%n%d%n", x, y, z);
        System.out.printf("%n%d%n%d%n%d%n", a, b, c);

        scanner.close();
    }
}
