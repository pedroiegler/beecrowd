import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[4]; 

        for (int i = 0; i < 4; i++) {
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        if (numeros[0] + numeros[1] > numeros[2] || numeros[1] + numeros[2] > numeros[3]) 
            System.out.printf("S%n");
        else 
            System.out.printf("N%n");
		
    }
}