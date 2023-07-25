import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int x, z, soma = 0, cont = 0;

        x = scanner.nextInt();
        z = scanner.nextInt();

        while (z <= x){
            z = scanner.nextInt();
        }

        for(;;){
            if(soma > z){
                break;
            }else{
                cont++;
                soma += x;
                x++;
            }
        }

        System.out.printf("%d%n", cont);
    }
}

