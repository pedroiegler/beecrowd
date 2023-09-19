import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m, i;
        String s;

        n = scanner.nextInt();
        m = scanner.nextInt();

        for(i = 0; i < m; i++){
            s = scanner.next();

            if(s.equals("fechou"))
                n+=1;
            else
                n-=1;
        }

        System.out.printf("%d%n", n);

        scanner.close();
    }
}
