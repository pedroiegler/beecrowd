import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int carta1, carta2;

        String valores;

        valores = entrada.nextLine();

        String[] values = valores.split(" ");
        
        carta1 = Integer.parseInt(values[0]);
        carta2 = Integer.parseInt(values[1]);
        
        if (carta2 > carta1)
            System.out.printf("%d%n", carta2);
        else
            System.out.printf("%d%n", carta1);
    }
}
