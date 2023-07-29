import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
    
        int[] n = new int[10];
        int a, v;
        v = scanner.nextInt();

        for(a = 0; a < 10; a++){
            n[a] = v;
            System.out.printf("N[%d] = %d%n", a, v);
            v *= 2;
        }

    }
}

