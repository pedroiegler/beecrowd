import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            double soma = 0.0;
            
            String nome = scanner.next();
            float num = scanner.nextFloat();
            
            float maior = 0.0f;
            float menor = 0.0f;
            
            for (int j = 0; j < 7; j++) {
                float notas = scanner.nextFloat();
                
                if (j == 0) {
                    maior = notas;
                    menor = notas;
                }
                
                if (notas > maior) {
                    maior = notas;
                }
                
                if (notas < menor) {
                    menor = notas;
                }
                
                soma += notas;
            }
            
            System.out.printf("%s %.2f\n", nome, ((soma - (maior + menor)) * num));
        }
        
        scanner.close();
    }
}
