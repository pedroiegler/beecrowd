import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++)
			System.out.print(frase.charAt(i));

		System.out.println();
		
    }
}