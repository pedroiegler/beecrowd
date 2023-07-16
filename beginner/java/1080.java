import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n, maior = 0, posicao = 0;

        for(i = 1; i <= 100; i++){
            n = scanner.nextInt();

            if(n > maior){
                maior = n;
                posicao = i;
            }
        }

        System.out.printf("%d%n", maior);
        System.out.printf("%d%n", posicao);

        scanner.close();

    }
}

