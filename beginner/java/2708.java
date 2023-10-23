import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String action;
        int n, cont1 = 0, cont2 = 0;

        while(true){

            action = scanner.next();

            if(action.equals("ABEND"))
                break;
            else{
                n = scanner.nextInt();

                if(action.equals("SALIDA")){
                    cont1+=n;
                    cont2+=1;
                } else{
                    cont1-=n;
                    cont2-=1;
                }
            }
        }

        System.out.printf("%d%n%d%n", cont1, cont2);
    }
}
