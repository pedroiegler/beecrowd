import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int i, j, n, cont = 1, v, soma;

        n = entrada.nextInt();

        for(i = 0; i < n; i++){

            soma = 0;

            v = entrada.nextInt();

            for(j = 1; j <= v; j++){
                if(j % 2 != 0){
                    soma += cont;
                } else{
                    soma -= cont;
                }
            }

            System.out.printf("%d%n", soma);
        }
    }
}
