import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        int qtsCaracteres = texto.length();

        if (qtsCaracteres > 140) {
            System.out.println("MUTE");
        } else {
            System.out.println("TWEET");
        }
    }
}
