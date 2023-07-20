import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, x, y, i;
        float result;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
        
            if(y == 0)
                System.out.println("divisao impossivel");
            else{
                result = (float) x / y;
                System.out.printf("%.1f%n", result);
            }
            
        }

        scanner.close();

    }
}


