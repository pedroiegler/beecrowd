import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i, m, soma = 0, menor, maior;

        for(;;){
            soma = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();

            if(n <= 0 || m <= 0)
                break;
            else{
                if(n < m){
                    menor = n;
                    maior = m;
                } else{
                    menor = m;
                    maior = n;
                }

                for(i = menor; i <= maior; i++){
                    System.out.printf("%d ", i);
                    soma += i;
                }
                System.out.printf("Sum=%d%n", soma);
            }
        }

        scanner.close();

    }
}

