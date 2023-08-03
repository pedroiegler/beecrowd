import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] m = new double[12][12];
        double soma = 0.0;
        int i, j;
        char operacao;
        
        operacao = scanner.next().charAt(0);

        for(i = 0; i < 12; i++){
            for(j = 0; j < 12; j++){
                m[i][j] = scanner.nextDouble();
            }
        }

        int cont = 0;
        for(i = 0; i < 12; i++){
            for(j = 0; j < 12; j++){
                if(i > j){
                    soma += m[i][j];
                    cont++;
                }
            }
        }

        if(operacao == 'S'){
            System.out.printf("%.1f%n", soma);
        } else if(operacao == 'M'){
            System.out.printf("%.1f%n", soma / cont);
        }

        scanner.close();
    }
}
