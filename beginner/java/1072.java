import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, x, contIn = 0, contOut = 0;

        n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            x = scanner.nextInt();

            if(x >= 10 && x <= 20){
                contIn++;
            } else{
                contOut++;
            }
        }

        System.out.printf("%d in%n", contIn);
        System.out.printf("%d out%n", contOut);

        scanner.close();

    }
}

