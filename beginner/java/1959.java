import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        long a, b, r;
        
        a = entrada.nextLong();
        b = entrada.nextLong();

        r = a * b;
        
        System.out.println(r);
    
    }
}
