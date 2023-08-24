import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int a, b, c, d = 0, e = 1;

        a = entrada.nextInt();

        int[] ara = new int[a];
        for(b = 0; b < a; b++)
            ara[b] = entrada.nextInt();

        c = ara[d];
        for(d = 0; d < a; d++){
            if(ara[d]<c){
                c = ara[d];
                e = d + 1;
            }

        }

        System.out.printf("%d%n", e);
		
    }
}