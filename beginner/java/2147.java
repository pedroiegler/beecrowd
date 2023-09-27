import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short casos;
        String palavra;
        float resultado = 0.01f;
    
    
        casos = scanner.nextShort();
        scanner.nextLine();
    
        while (casos!=0){
    
            palavra = scanner.nextLine();
    
            System.out.printf("%.2f%n", (palavra.length())*resultado);
    
            casos--;
        }
        

        scanner.close();
    }
}
