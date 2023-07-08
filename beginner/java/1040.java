import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, n4;

        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        n4 = scanner.nextFloat();

        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        float exame, mediaF;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno aprovado.%n");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno reprovado.%n");
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno em exame.%n");
            exame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            mediaF = (media + exame) / 2;
            if (mediaF >= 5.0) {
                System.out.printf("Aluno aprovado.%n");
                System.out.printf("Media final: %.1f%n", mediaF);
            } else {
                System.out.printf("Aluno reprovado.%n");
                System.out.printf("Media final: %.1f%n", mediaF);
            }
        }

        scanner.close();
    }
}
