import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float a, b, c, temp;

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        if(a < b){
            temp = a;
            a = b;
            b = temp;
        } 
        if(a < c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b < c){
            temp = b;
            b = c;
            c = temp;
        }

        double powA = Math.pow(a,2);
        double powB = Math.pow(b,2);
        double powC = Math.pow(c,2);

        if(a >= (b+c) || b >= (a+c) || c >= (a+b))
            System.out.println("NAO FORMA TRIANGULO");
        else if(powA == (powB + powC) || powB == (powA + powC) || powC == (powA + powB))
            System.out.println("TRIANGULO RETANGULO");
        else if(powA > (powB + powC) || powB > (powA + powC) || powC > (powA + powB))
            System.out.println("TRIANGULO OBTUSANGULO");
        else if(powA < (powB + powC) || powB < (powA + powC) || powC < (powA + powB))
            System.out.println("TRIANGULO ACUTANGULO");
        if(a == b && a == c)
            System.out.println("TRIANGULO EQUILATERO");
        if((a == b && a != c)  || (a == c && a != b) || (b == c && b != a))
            System.out.println("TRIANGULO ISOSCELES");

        scanner.close();
    }
}
