import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] troco = {7, 12, 22, 52, 102, 15, 25, 55, 105, 30, 60, 110, 70, 120, 150, 4, 10, 20, 40, 100, 200};
        int possivel = 0;
        int n, m, valor;

        while(true){
            n = scanner.nextInt();
            m = scanner.nextInt();

            if(n == 0 && m == 0)
                break;
            else{
                valor = m - n;

                for(int i = 0; i < 21; i++){
                    if(valor == troco[i])
                        possivel = 1;
                }

                if(possivel == 1){
                    System.out.println("possible");
                    possivel = 0;
                }
                else
                    System.out.println("impossible");
            }
        }

        scanner.close();
    }
}
