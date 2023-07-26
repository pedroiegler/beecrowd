import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i; 
        double s = 0.0, n = 100.0;

        for(i = 1; i <= n; i++){
            s = s + (1.0/i);
        }

        System.out.printf("%.2lf%n", s);
    }
}

