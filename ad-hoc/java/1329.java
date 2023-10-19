import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 1, i, jogada, contM, contJ;

        for(;;){
            n = scanner.nextInt();

            if(n == 0)
                break;
                
            contM = 0;
            contJ = 0;

            for(i = 0; i < n; i++){
                jogada = scanner.nextInt();

                if(jogada == 0)
                    contM+=1;
                else
                    contJ+=1;
            }

            System.out.printf("Mary won %d times and John won %d times%n", contM, contJ);
        }
    }
}
