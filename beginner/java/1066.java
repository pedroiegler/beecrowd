import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n, i, contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;

        for(i = 0; i < 5; i++){
            n = scanner.nextInt();
            if(n > 0)
                contPos+=1;
            if(n < 0)
                contNeg+=1;
            if(n % 2 == 0)
                contPar+=1;
            if(n % 2 != 0)
                contImpar+=1;
        }
    
        System.out.printf("%d valor(es) par(es)\n", contPar);
        System.out.printf("%d valor(es) impar(es)\n", contImpar);
        System.out.printf("%d valor(es) positivo(s)\n", contPos);
        System.out.printf("%d valor(es) negativo(s)\n", contNeg);

    }
}

