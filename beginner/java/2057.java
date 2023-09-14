import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saida, tempo, fuso;

        saida = scanner.nextInt();
        tempo = scanner.nextInt();
        fuso = scanner.nextInt();

        if(saida == 0)
            saida = 24;

        int chegada = saida + tempo + fuso;

        if(chegada > 24){
            chegada -= 24;
            System.out.printf("%d%n", chegada);
        } else if(chegada == 24){
            chegada = 0;
            System.out.printf("%d%n", chegada);
        } else{
            System.out.printf("%d%n", chegada);
        }

        scanner.close();
    }
}
