import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

    	double valor, valorNovo;

		valor = scanner.nextDouble();
		valorNovo = scanner.nextDouble();

		System.out.printf("%.2f%%%n", ((valorNovo * 100)/valor) - 100);
    }
	
}