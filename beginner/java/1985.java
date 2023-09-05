import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, index;
        double value, soma = 0;
    
        n = scanner.nextInt();
        scanner.nextLine();
    
        for(i = 0; i < n; i++){
            String valores = scanner.nextLine();
            String[] linha = valores.split(" ");

            index = Integer.parseInt(linha[0]);
            value = Double.parseDouble(linha[1]);
    
            if(index == 1001){
                value *= 1.50;
                soma += value;
            } else if(index == 1002){
                value *= 2.50;
                soma += value;
            } else if(index == 1003){
                value *= 3.50;
                soma += value;
            } else if(index == 1004){
                value *= 4.50;
                soma += value;
            } else if(index == 1005){
                value *= 5.50;
                soma += value;
            }
        }
    
        System.out.printf("%.2f%n", soma);
    }
}
