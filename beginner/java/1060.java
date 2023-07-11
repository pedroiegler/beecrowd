import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, cont = 0;
        float n;

        for(i = 0; i < 6; i++){
            n = scanner.nextFloat();
            if(n > 0){
                cont++;
            }
        }

        System.out.println(cont + " valores positivos");

        scanner.close();
    }
}


