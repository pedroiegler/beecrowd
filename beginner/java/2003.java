import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String linha = scanner.next();
            String[] partes = linha.split(":");
            
            short hora = Short.parseShort(partes[0]);
            short minuto = Short.parseShort(partes[1]);

            short resultado = 0;

            if (hora >= 5 && hora <= 6) {
                System.out.println("Atraso maximo: " + resultado);
            } else if (hora == 7) {
                System.out.println("Atraso maximo: " + minuto);
            } else if (hora == 8) {
                System.out.println("Atraso maximo: " + (60 + minuto));
            } else if (hora == 9) {
                System.out.println("Atraso maximo: " + (120 + minuto));
            }
        }
    }
}
