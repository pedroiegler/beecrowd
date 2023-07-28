import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, j, x, n, soma;

        x = scanner.nextInt();

        for(i = 0; i < x; i++){
            soma = 0;
            n = scanner.nextInt();

            for(j = 1; j < n; j++){
                if(n % j == 0){
                    soma += j;
                }
            }

            if(soma == n){
                System.out.printf("%d eh perfeito%n", n);
            } else{
                System.out.printf("%d nao eh perfeito%n", n);
            }

        }
    }
}

