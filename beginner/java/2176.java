import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String mensagem = scanner.nextLine();
            int contador = 0;
            
            for (char c : mensagem.toCharArray()) {
                if (c == '1') {
                    contador++;
                }
            }

            if (contador % 2 == 0) {
                mensagem += "0";
            } else {
                mensagem += "1";
            }
            
            System.out.println(mensagem);
        }

        scanner.close();
    }
}
