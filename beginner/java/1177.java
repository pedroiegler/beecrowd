import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n, aux = 0;
        int[] v = new int[1000];

        n = scanner.nextInt();

        for(i = 0; i < 1000; i++){
            v[i] = aux;
            aux++;
            if(aux == n){
                aux = 0;
            }
        }

        for(i = 0; i < 1000; i++){
            System.out.printf("N[%d] = %d%n", i, v[i]);
        }

        scanner.close();
    }
}
