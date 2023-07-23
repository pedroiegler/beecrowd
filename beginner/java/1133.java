import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n1, n2, menor, maior;

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if(n1 > n2){
            maior = n1;
            menor = n2;
        } else{
            maior = n2;
            menor = n1;
        }

        menor = menor + 1;

        for(i = menor; i < maior; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.printf("%d%n", i);
            }
        }

    }
}

