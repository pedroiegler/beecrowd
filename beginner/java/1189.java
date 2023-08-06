import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] m = new double[12][12];
        int i, j;
        char operacao;

        operacao = scanner.next().charAt(0);

        for(i = 0; i < 12; i++){
            for(j = 0; j < 12; j++){
                m[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.printf("%.1f%n", soma_or_media(m, operacao));



        scanner.close();
    }

    public static double soma_or_media(double[][] mat, char op){
        int p = 0, r = 4, i, j, cont = 0;
        double soma = 0.0;

        for(i = 1; i < 11; i++){
            if(i <= 5){
              for(j = 0; j <= p; j++)
                  soma += mat[i][j];
                  cont++;
              p++;
            }
            else if(i >= 6){
              for(j = 0; j <= r; j++)
                  soma += mat[i][j];
                  cont++;
              r--;
            }
        }
    
        
        if(op == 'S'){
            return soma;
        } else{
            return soma/cont;
        }
    }
}
