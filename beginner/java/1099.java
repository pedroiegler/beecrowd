import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, j, n, n1, n2, soma, maior = 0, menor = 0;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            soma = 0;
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            if(n1 < n2){
                menor = n1+1;
                maior = n2;
            } else{
                menor = n2+1;
                maior = n1;
            }

            for(j = menor; j < maior; j++){
                if(j % 2 != 0){
                    soma += j;
                }
            }

            System.out.printf("%d%n", soma);
        }

        scanner.close();

    }
}

