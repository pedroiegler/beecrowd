import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int t, i, pa, pb, cont;
        double g1, g2;

        t = scanner.nextInt();

        for(i = 0; i < t; i++){
            cont = 0;
            pa = scanner.nextInt();
            pb= scanner.nextInt();
            g1 = scanner.nextDouble();
            g2 = scanner.nextDouble();

            for(;;){
                cont++;
                pa = (int) (pa + ((pa * g1) / 100));
                pb = (int) (pb + ((pb * g2) / 100));

                if(cont > 100){
                    System.out.printf("Mais de 1 seculo.%n");
                    break;
                } else if(pa > pb){
                    System.out.printf("%d anos.%n", cont);
                    break;
                }
            }
        }
    }
}

