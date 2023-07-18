import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float i = 0;
        float j = 1;
        
        while(i <= 2.2){
            if((i>0 && i<1)|| (i>1 && i<2) || (i>2.1 && i<=2.2) )
            {
                System.out.printf("I=%.1f J=%.1f%n",i,j+i);
                System.out.printf("I=%.1f J=%.1f%n",i,j+1+i);
                System.out.printf("I=%.1f J=%.1f%n",i,j+2+i);
            }
            else
            {
                System.out.printf("I=%d J=%d%n",(int)i,(int)j+(int)i);
                System.out.printf("I=%d J=%d%n",(int)i,(int)j+1+(int)i);
                System.out.printf("I=%d J=%d%n",(int)i,(int)j+2+(int)i);
            }
            
            i+= 0.2;
        }

        scanner.close();

    }
}

