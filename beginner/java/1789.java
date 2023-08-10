import java.io.IOException;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

    	short n = 0, i, maior = 0, x, result = 0;

		while(scanner.hasNext()){
			n = scanner.nextShort();

			for(i = 0; i < n; i++){
				x = scanner.nextShort();

				if(i == 0)
					maior = x;
				
				if(x > maior)
					maior = x;



				if(maior < 10)
					result = 1;
				
				if(maior >= 10 && maior < 20)
					result = 2;
				
				if(maior >= 20)
					result = 3;
			
			}

			System.out.printf("%d%n", result);
		}
    }
}
