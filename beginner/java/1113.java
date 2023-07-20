import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        while(true){
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
    
            if(n1 == n2)
                break;
            else if(n1 > n2)
                System.out.println("Decrescente");
            else
                System.out.println("Crescente");
        }       

        scanner.close();

    }
}

