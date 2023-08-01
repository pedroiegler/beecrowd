import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, n, auxPar = 0, auxImpar = 0;
        int[] vetPar = new int[5];
        int[] vetImpar = new int[5];

        for (i = 0; i < 15; i++) {
            n = scanner.nextInt();
            if (n % 2 == 0) {
                vetPar[auxPar] = n;
                auxPar++;

                if (auxPar == 5) {
                    for (j = 0; j < 5; j++) {
                        System.out.printf("par[%d] = %d%n", j, vetPar[j]);
                    }
                    auxPar = 0;
                }
            } else {
                vetImpar[auxImpar] = n;
                auxImpar++;
                if (auxImpar == 5) {
                    for (j = 0; j < 5; j++) {
                        System.out.printf("impar[%d] = %d%n", j, vetImpar[j]);
                    }
                    auxImpar = 0;
                }
            }
        }

        for (i = 0; i < auxImpar; i++) {
            System.out.printf("impar[%d] = %d%n", i, vetImpar[i]);
        }
        for (i = 0; i < auxPar; i++) {
            System.out.printf("par[%d] = %d%n", i, vetPar[i]);
        }

        scanner.close();
    }
}
