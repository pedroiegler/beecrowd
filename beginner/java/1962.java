import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n, i, value;

        n = entrada.nextInt();
        
        for(i = 0; i < n; i++){
            value = entrada.nextInt();

            if(value >= 2015){
                System.out.printf("%d A.C.%n", value-2014);
            } else{
                System.out.printf("%d D.C.%n", 2015-value);
            }
        }
    }
}
