import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n, x = 0, cont = 0;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            x+=1;
            System.out.printf("%d ", x);
            cont+=1;
            x+=1;
            System.out.printf("%d ", x);
            cont+=1;
            x+=1;
            System.out.printf("%d ", x);
            cont+=1;
            System.out.printf("PUM%n");
            cont = 0;
            x+=1;

        }
    }
}

