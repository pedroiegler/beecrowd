import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, h, m, o;
    
        n = scanner.nextInt();
        
        for(i = 0; i < n; i++){
            h = scanner.nextInt();
            m = scanner.nextInt();
            o = scanner.nextInt();
            
            if(h < 10 && m < 10){
                if(o == 1)
                    System.out.printf("0%d:0%d - A porta abriu!%n", h, m);
                else
                    System.out.printf("0%d:0%d - A porta fechou!%n", h, m);
            } else if(h < 10 && m >= 10){
                if(o == 1)
                    System.out.printf("0%d:%d - A porta abriu!%n", h, m);
                else
                    System.out.printf("0%d:%d - A porta fechou!%n", h, m);
            } else if(h >= 10 && m < 10){
                if(o == 1)
                    System.out.printf("%d:0%d - A porta abriu!%n", h, m);
                else
                    System.out.printf("%d:0%d - A porta fechou!%n", h, m);
            } else if(h >= 10 && m >= 10){
                if(o == 1)
                    System.out.printf("%d:%d - A porta abriu!%n", h, m);
                else
                    System.out.printf("%d:%d - A porta fechou!%n", h, m);
            }
        
        }
        

        scanner.close();
    }
}
