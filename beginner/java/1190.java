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
        int i, j, cont = 0;
        double soma = 0.0;

        for(i = 0; i < 12; i++)
			for(j = 0; j < 12; j++)
				if (i < j && i > 12 - j - 1){
					soma += mat[i][j];
                    cont++;
                }
    
        
        if(op == 'S'){
            return soma;
        } else{
            return soma/cont;
        }
    }
}
