import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;

        while(scanner.hasNext()){
            n = scanner.nextInt();
            if(n == 360 || (n >= 0 && n < 90)){
                System.out.printf("Bom Dia!!%n");
            } else if(n >= 90 && n < 180){
                System.out.printf("Boa Tarde!!%n");
            } else if(n >= 180 && n < 270){
                System.out.printf("Boa Noite!!%n");
            } else if(n >= 270 && n < 360){
                System.out.printf("De Madrugada!!%n");
            }
        }

        scanner.close();
    }
}
