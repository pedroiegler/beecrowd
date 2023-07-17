import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, j;

        i = 1;
        j = 60;

        for(;;){

            System.out.printf("I=%d J=%d%n", i, j);

            i = i + 3;
            j = j - 5;

            if(j < 0){
                break;
            }
        }

        scanner.close();

    }
}

