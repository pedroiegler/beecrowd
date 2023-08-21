import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, n3, n4;
    
		String[] valores;
		valores = entrada.nextLine().split(" ");

		n1 = Integer.parseInt(valores[0]);
		n2 = Integer.parseInt(valores[1]);
		n3 = Integer.parseInt(valores[2]);
		n4 = Integer.parseInt(valores[3]);
        
        System.out.printf("%d%n", ((n1 + n2 + n3 + n4) - 3));
    }
}