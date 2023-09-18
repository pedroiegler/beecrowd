import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n, value, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            value = scanner.nextInt();

            if(value % 2 == 0)
                cont2++;
            if(value % 3 == 0)
                cont3++;
            if(value % 4 == 0)
                cont4++;
            if(value % 5 == 0)
                cont5++;
        }

        System.out.printf("%d Multiplo(s) de 2%n", cont2);
        System.out.printf("%d Multiplo(s) de 3%n", cont3);
        System.out.printf("%d Multiplo(s) de 4%n", cont4);
        System.out.printf("%d Multiplo(s) de 5%n", cont5);

        scanner.close();
    }
}
