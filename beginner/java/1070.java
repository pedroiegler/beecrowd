import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i, cont = 0;

        n = scanner.nextInt();

        for(i = n; i > 0; i++){
            if(cont == 6){
                break;
            }
            else if(i % 2 != 0){
                System.out.printf("%d%n", i);
                cont++;
            }
        }

        scanner.close();

    }
}

