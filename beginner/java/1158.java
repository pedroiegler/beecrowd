import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, x, y, n, j, cont = 0, soma;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            soma = 0;
            cont = 0;
            x = scanner.nextInt();
            y = scanner.nextInt();

            while(cont != y){
                if(x % 2 != 0){
                    soma += x;
                    cont++;
                }
                x++;
            }

            System.out.printf("%d%n", soma);
        }
    }
}

