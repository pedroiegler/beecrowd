import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, v, cont = 0;
    
        n = scanner.nextInt();
        
        for(i = 0; i < 5; i++){
        v = scanner.nextInt();
            if(v == n)
                cont++;
        }
        
        System.out.printf("%d%n", cont);
    }
}
