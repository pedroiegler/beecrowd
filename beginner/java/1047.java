import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

		int horaIni, horaFim, minIni, minFim, dif;
        horaIni = scanner.nextInt();
        minIni = scanner.nextInt();
        horaFim = scanner.nextInt();
        minFim = scanner.nextInt();

        dif = ((horaFim * 60) + minFim) - ((horaIni * 60) + minIni);

        if (dif <= 0) {
            dif += 24 * 60;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", dif / 60, dif % 60);
	
        scanner.close();
    }
}