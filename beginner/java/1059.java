import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n;

        for(n = 1; n <= 100; n++){
            if(n % 2 == 0){
                System.out.println(n);
            }
        }

        scanner.close();
    }
}

