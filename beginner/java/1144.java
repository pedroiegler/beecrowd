import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i, c, d, e, f;

        n = scanner.nextInt();

        for(i = 1; i <= n; i++){

            c=i*i;
            d=i*i*i;

            System.out.printf("%d %d %d%n",i,c,d);

            e=c+1;
            f=d+1;
            
            System.out.printf("%d %d %d%n",i,e,f);
        }
    }
}

