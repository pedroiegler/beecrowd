import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int x = 0, y = 0, i, menor, maior, soma = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x < y){
            menor = x;
            maior = y;
        } else{
            menor = y;
            maior = x;
        }

        for(i = menor; i <= maior; i++){
            if(i % 13 != 0)
                soma+=i;
        }

        System.out.printf("%d%n", soma);

    }
}

