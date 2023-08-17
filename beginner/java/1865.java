import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int i, n, x;

        n = entrada.nextInt();
        entrada.nextLine(); 

        for(i = 0; i < n; i++){
            String partida = entrada.nextLine();
            String name[] = partida.split(" ");

            String nome = name[0];
            int numero = Integer.valueOf(name[1]);

            if(nome.equals("Thor"))
                System.out.println("Y");
            else
                System.out.println("N");
        }
    }
}
