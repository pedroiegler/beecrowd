import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, e, f = 0, q, r;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a < 0){

            e = b;

            if(b < 0) 
                e = b *- 1;

            for(r = 0; r < e; r++){
                f = a - r;
                if(f % b== 0) 
                    break;
            }
            q = f / b;
        }else{
            q = a / b;
            r = a % b;
        }

        System.out.printf("%d %d%n", q, r);

        scanner.close();
    }
}
