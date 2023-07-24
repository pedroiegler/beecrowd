import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n = 1, i, x;

        while(n != 0){
            n = scanner.nextInt();

            for(x = 1; x <= n; x++){
                if(x == n){
                    System.out.printf("%d%n", x);
                } else{
                    System.out.printf("%d ", x);
                }
            }
        }
    }
}

