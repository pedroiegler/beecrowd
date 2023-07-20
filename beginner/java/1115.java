import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int x, y;

        for(;;){
            x = scanner.nextInt();
            y = scanner.nextInt();

            if(x > 0 && y > 0)
                System.out.println("primeiro");
            else if(x > 0 && y < 0)
                System.out.println("quarto");
            else if(x < 0 && y < 0)
                System.out.println("terceiro");
            else if(x < 0 && y > 0)
                System.out.println("segundo");
            else if(x == 0 || y == 0)
                break;
        }

        scanner.close();

    }
}

