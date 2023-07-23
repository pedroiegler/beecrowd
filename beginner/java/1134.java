import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int tipo = 0, contAlcool = 0, contDiesel = 0, contGasolina = 0;

        while(tipo != 4){
            tipo = scanner.nextInt();

            if(tipo == 1){
                contAlcool+=1;
            } else if(tipo == 2){
                contGasolina+=1;
            } else if(tipo == 3){
                contDiesel+=1;
            }
        }

        System.out.printf("MUITO OBRIGADO%n");
        System.out.printf("Alcool: %d%n", contAlcool);
        System.out.printf("Gasolina: %d%n", contGasolina);
        System.out.printf("Diesel: %d%n", contDiesel);

    }
}

