import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float valor = scanner.nextFloat();

        if(valor >= 0 && valor <= 400.00){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.15) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.15));
            System.out.printf("Em percentual: 15 %%%n");
        }

        else if(valor >= 400.01 && valor <= 800.00){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.15) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.15));
            System.out.printf("Em percentual: 15 %%%n");
        }

        else if(valor >= 800.01 && valor <= 1200.00){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.10) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.10));
            System.out.printf("Em percentual: 10 %%%n");
        }

        else if(valor >= 1200.01 && valor <= 2000.00){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.07) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.07));
            System.out.printf("Em percentual: 7 %%%n");
        }

        else{
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.04) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.04));
            System.out.printf("Em percentual: 4 %%%n");
        }

        scanner.close();
    }
}
