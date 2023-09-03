import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

    	int n, i, matricula, matricular_maior = 0;
		double nota, maior = 0;

		n = scanner.nextInt();

		for(i = 0; i < n; i++){
			matricula = scanner.nextInt();
			nota = scanner.nextDouble();

			if(nota > maior){
				maior = nota;
				matricular_maior = matricula;
			}

		}

		if(maior >= 8){
			System.out.printf("%d%n", matricular_maior);
		} else{
			System.out.printf("Minimum note not reached%n");
    }
    }
	
}