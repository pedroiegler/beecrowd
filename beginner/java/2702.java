import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] atendidos = new int[3];
        int[] requisitados = new int[3];
        int naoAtendidos = 0;

        atendidos[0] = scanner.nextInt();
        atendidos[1] = scanner.nextInt();
        atendidos[2] = scanner.nextInt();

        requisitados[0] = scanner.nextInt();
        requisitados[1] = scanner.nextInt();
        requisitados[2] = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            if (requisitados[i] > atendidos[i]) {
                naoAtendidos += requisitados[i] - atendidos[i];
            }
        }

        System.out.println(naoAtendidos);
    }
}
