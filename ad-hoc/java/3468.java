import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        String idea;
        idea = entrada.nextLine().toLowerCase();

        if (idea.equals("oposicao") || idea.equals("contrariedade")) {
            System.out.println("mas");
        } else if (idea.equals("quantidade") || idea.equals("intensidade")) {
            System.out.println("mais");
        }
    }
}
