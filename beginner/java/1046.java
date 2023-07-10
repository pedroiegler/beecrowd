import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int horaIni = scanner.nextInt();
        int horaFin = scanner.nextInt();
        int cont = 0;

        while(true){
            horaIni++;
            cont++;
            if(horaIni == 24){
                horaIni = 0;
            }
            if(horaIni == horaFin){
                break;
            }
        }
        
        System.out.println("O JOGO DUROU " + cont + " HORA(S)");

        scanner.close();
    }
}
