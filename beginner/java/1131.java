import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int golInter = 0, golGremio = 0, resposta = 1, qtdGrenais = 0, vitoriaInter = 0, vitoriaGremio = 0, empates = 0;

        while(resposta == 1){
        
            golInter = scanner.nextInt();
            golGremio = scanner.nextInt();
    
            qtdGrenais+=1;
    
            if(golInter > golGremio){
                vitoriaInter+=1;
            } else if(golGremio > golInter){
                vitoriaGremio+=1;
            } else if(golInter == golGremio){
                empates+=1;
            }
    
            System.out.printf("Novo grenal (1-sim 2-nao)%n");
            resposta = scanner.nextInt();
    
        }
    
        System.out.printf("%d grenais%n", qtdGrenais);
        System.out.printf("Inter:%d%n", vitoriaInter);
        System.out.printf("Gremio:%d%n", vitoriaGremio);
        System.out.printf("Empates:%d%n", empates);
        if (vitoriaInter > vitoriaGremio)
            System.out.printf("Inter venceu mais%n"); 
        else
            System.out.printf("Gremio venceu mais%n");
        scanner.close();

    }
}

