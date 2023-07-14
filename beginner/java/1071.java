import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int x, y, soma = 0, menor = 0, maior = 0, i;

        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x < y){
            menor = x;
            maior = y;
        } 
        if(y < x){
            menor = y;
            maior = x;
        }

        if(menor % 2 != 0){
            for(i = menor+1; i < maior; i++){
                if(i % 2 != 0){
                    soma = soma + i;
                }
            }
        }
        else{
            for(i = menor; i < maior; i++){
                if(i % 2 != 0){
                    soma = soma + i;
                }
            }
        }

        System.out.println(soma);

        scanner.close();

    }
}

