import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
    
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    
        if(a > b){
            if(b > c){
                if((b-c)<(a-b))
                    System.out.printf(":)%n");
                else 
                    System.out.printf(":(%n");
            }
            else 
                System.out.printf(":)%n");
        }
        else if(b > a){
            if(c > b){
                if((c-b)<(b-a)) 
                    System.out.printf(":(%n");
                else
                    System.out.printf(":)%n");
            }
            else 
                System.out.printf(":(%n");
        }
        else if(c > b) 
            System.out.printf(":)%n");
        else 
            System.out.printf(":(%n");

        scanner.close();
    }
}
