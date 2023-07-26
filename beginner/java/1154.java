import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, idade, soma = 0, total = 0;
        double media;

        for(;;){
            idade = scanner.nextInt();
            if(idade >= 0){
                soma += idade;
                total++;
            }else{
                break;
            }
        }

        media = (double) soma / total;

        System.out.printf("%.2f%n", media);
    }
}

