import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n, cont = 0;

        for(i = 0; i < 5; i++){
            n = scanner.nextInt();
            if(n % 2 == 0){
                cont+=1;
            }
        }

        System.out.println(cont + " valores pares");

    }
}

