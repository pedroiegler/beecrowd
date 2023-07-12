import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float salario = scanner.nextFloat();

        if(salario >= 0.00 && salario <= 2000.00){
            System.out.printf("Isento\n");
        } else if(salario >= 2000.01 && salario <= 3000.00){
            System.out.printf("R$ %.2f\n", ((salario - 2000)  * 0.08));
        } else if(salario >= 3000.01 && salario <= 4500.00){
            System.out.printf("R$ %.2f\n", ((1000 * 0.08) + ((salario - 3000) * 0.18)));
        } else{
            System.out.printf("R$ %.2f\n", ((1000 * 0.08) + (1500 * 0.18)  + ((salario - 4500) * 0.28)));
        }    

        scanner.close();
    }
}

