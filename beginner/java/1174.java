import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
    
        double[] v = new double[100];
        int i;
    
        for(i = 0; i < 100; i++){
            v[i] = scanner.nextDouble();
        }
    
        for(i = 0; i < 100; i++){
            if(v[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, v[i]);
            }
        }

    }
}

