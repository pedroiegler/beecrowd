import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i;

        n = scanner.nextInt();

        for(i = 0; i < 10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }

        scanner.close();

    }
}

