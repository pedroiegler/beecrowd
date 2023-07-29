import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
    
        int[] x = new int[10];
        int i;

        for(i = 0; i < 10; i++){
            x[i] = scanner.nextInt();

            if(x[i] < 0 || x[i] == 0){
                x[i] = 1;
            }
        }

        for(i = 0; i < 10; i++){
            System.out.printf("X[%d] = %d%n", i, x[i]);
        }

    }
}

