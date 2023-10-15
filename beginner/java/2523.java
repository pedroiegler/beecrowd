import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j, n1;
        char[] alfabeto = new char[26];

        while (scanner.hasNext()) {
            String alfabetoStr = scanner.next();
            alfabeto = alfabetoStr.toCharArray();
            n = scanner.nextInt();

            for (i = 0; i < n; i++) {
                n1 = scanner.nextInt();

                for (j = 0; j < alfabeto.length; j++) {
                    char letra = alfabeto[j];

                    if (i == n - 1) {
                        if (j + 1 == n1) {
                            System.out.println(letra);
                        }
                    } else {
                        if (j + 1 == n1) {
                            System.out.print(letra);
                        }
                    }
                }
            }
        }
    }
}
