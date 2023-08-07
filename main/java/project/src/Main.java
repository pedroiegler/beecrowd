import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, j, n, value, iniMatriz, fimMatriz;

        while(true){
            n = scanner.nextInt();

            if(n == 0)
                break;
            
            iniMatriz = 0;
            fimMatriz = n;
            value = 1;

            int[][] m = new int[n][n];

            while(true){
                for(i = iniMatriz; i < fimMatriz; i++)
                    for(j = iniMatriz; j < fimMatriz; j++)
                        m[i][j] = value;
                    
                if(fimMatriz == 0)
                    break;
                
                fimMatriz--;
                iniMatriz++;
                value++;
            }

            for (i = 0; i < n; i++){
                    for (j = 0; j < n; j++){
                        if (j == 0)
                            System.out.printf("%3d", m[i][j]);
                        else
                            System.out.printf(" %3d", m[i][j]);
                    }
                    System.out.printf("%n");
                }

                System.out.printf("%n");
        }
    }
}
