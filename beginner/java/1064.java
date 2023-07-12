import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i = 0, cont = 0;
        double n, media = 0;
        
        for(i = 0; i < 6; i++){
            n = scanner.nextDouble();
            if(n > 0){
                cont++;
                media += n;
            }
        }

        media = media / cont;
        
        System.out.printf("%d valores positivos%n", cont);
        System.out.printf("%.1f%n", media);

    }
}

