import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n, n1, n2;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            int soma = 0;
            soma = n1 + n2;

            switch (soma){
                case 0: System.out.println("PROXYCITY"); break;
                case 1: System.out.println("P.Y.N.G."); break;
                case 2: System.out.println("DNSUEY!"); break;
                case 3: System.out.println("SERVERS"); break;
                case 4: System.out.println("HOST!"); break;
                case 5: System.out.println("CRIPTONIZE"); break;
                case 6: System.out.println("OFFLINE DAY"); break;
                case 7: System.out.println("SALT"); break;
                case 8: System.out.println("ANSWER!"); break;
                case 9: System.out.println("RAR?"); break;
                case 10: System.out.println("WIFI ANTENNAS"); break;
                default: break;
            }
        }
    }
}
