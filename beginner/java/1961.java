import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int p, q, cnt = 0, i, dif;

        p = entrada.nextInt();
        q = entrada.nextInt();

        int[] jump = new int[q];

        for(i = 0; i < q; i++)
            jump[i] = entrada.nextInt();

        for(i = 1; i < q; i++){
            if(jump[i] > jump[i-1])
                dif = (jump[i] - jump[i-1]);
            else
                dif = (jump[i-1] - jump[i]);
            if(dif <= p)
                cnt++;
        }
        
        if(cnt == q-1)
            System.out.printf("YOU WIN%n");
        else
            System.out.printf("GAME OVER%n");
    }
}
