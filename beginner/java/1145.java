import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, x, y, cont = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();

        for(i = 1; i <= y; i++){
            System.out.printf("%d", i);
            cont++;
            if(cont == x){
                System.out.printf("%n");
                cont = 0;
            }else{
                System.out.printf(" ");
            }
        }
    }
}

