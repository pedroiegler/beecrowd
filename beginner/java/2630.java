import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, i, a, b, c;
        String val;

        n = scanner.nextInt();

        for(i = 1; i <= n; i++){
            val = scanner.next();
            
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if(val.equals("eye")){
                System.out.printf("Caso #%d: %d%n", i, (int) (0.30*a + 0.59*b + 0.11*c));
            } else if(val.equals("mean")){
                System.out.printf("Caso #%d: %d%n", i, ((a + b + c) / 3));
            } else if(val.equals("max")){
                if(a > b && a > c)
                    System.out.printf("Caso #%d: %d%n", i, a);
                else if(b > a && b > c)
                    System.out.printf("Caso #%d: %d%n", i, b);
                else
                    System.out.printf("Caso #%d: %d%n", i, c);
            } else if(val.equals("min")){
                if(a < b && a < c)
                    System.out.printf("Caso #%d: %d%n", i, a);
                else if(b < a && b < c)
                    System.out.printf("Caso #%d: %d%n", i, b);
                else
                    System.out.printf("Caso #%d: %d%n", i, c);
            }
        }

        scanner.close();
    }
}
