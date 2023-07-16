import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int i, n, quant, contR = 0, contS = 0, contC = 0, contT = 0;
        double mediaS = 0, mediaR = 0, mediaC = 0;
        char tipo;
    
        n = scanner.nextInt();
    
        for(i = 0; i < n; i++){
            quant = scanner.nextInt();
            tipo = scanner.next().charAt(0);

            contT += quant;
    
            if(tipo == 'R')
                contR += quant;
            else if(tipo == 'S')
                contS += quant;
            if(tipo == 'C')
                contC += quant;
            
        }
    
        mediaS = (contS * 100.0) / contT;
        mediaR = (contR * 100.0) / contT;
        mediaC = (contC * 100.0) / contT;
    
        System.out.printf("Total: %d cobaias%n", contT);
        System.out.printf("Total de coelhos: %d%n", contC);
        System.out.printf("Total de ratos: %d%n", contR);
        System.out.printf("Total de sapos: %d%n", contS);
        System.out.printf("Percentual de coelhos: %.2f %%%n", mediaC);
        System.out.printf("Percentual de ratos: %.2f %%%n", mediaR);
        System.out.printf("Percentual de sapos: %.2f %%%n", mediaS);

        scanner.close();

    }
}

