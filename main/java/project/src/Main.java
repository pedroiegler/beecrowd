import java.io.IOException;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

    	int n, i, j;
		int elemento;

		while (true){

			n = scanner.nextInt();

			if (n == 0)
				break;

			int[][] m = new int[n][n];

			elemento = 1;

			for (i = 0; i < n; i++){
				for (j = 0; j < n; j++){
					m[i][j] = elemento;
					elemento *= 2;
				}
				elemento = (m[i][0]) * 2;
			}

			int digitos = 0;
			int t;

			t = (m[n - 1][n - 1]);

			do{

				t %= 10;
				t = t / 10;
				digitos++;

			} while (t > 0);

			for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (j == 0)
                        System.out.printf("%" + digitos + "d", m[i][j]);
                    else
                        System.out.printf(" %" + digitos + "d", m[i][j]);
                }
                System.out.println();
            }

            System.out.println();
		}
    }
}
