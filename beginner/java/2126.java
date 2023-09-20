import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caso = 1;
        
        while (true) {
            try {
                String n1 = scanner.nextLine();
                String n2 = scanner.nextLine();
                System.out.println("Caso #" + caso + ":");
                int qt = 0;
                
                for (int i = 0; i <= n2.length() - n1.length(); i++) {
                    if (n2.substring(i, i + n1.length()).equals(n1)) {
                        qt++;
                    }
                }
                
                if (qt == 0) {
                    System.out.println("Nao existe subsequencia");
                } else {
                    System.out.println("Qtd.Subsequencias: " + qt);
                    int lastPos = n2.lastIndexOf(n1);
                    System.out.println("Pos: " + (lastPos + 1));
                }
                
                System.out.println();
                caso++;
                
            } catch (Exception e) {
                break;
            }
        }
        
        scanner.close();
    }
}
