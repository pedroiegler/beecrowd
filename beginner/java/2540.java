import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N, voto;

        N = scanner.nextInt();
    
        while (scanner.hasNext()) {
            int votos_favoraveis = 0;
            
            for (int i = 0; i < N; i++) {
                voto = scanner.nextInt();
                votos_favoraveis += voto;
            }
            
            if (votos_favoraveis * 3 >= 2 * N)
                System.out.println("impeachment");
            else
                System.out.println("acusacao arquivada");
        }
    }
}
