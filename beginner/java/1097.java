import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i,j;

        for(i = 1; i <= 9; i = i + 2){
            for(j = 6 + i; j > 3 + i; j--)
                System.out.printf("I=%d J=%d%n",i,j);
        }

        scanner.close();

    }
}

