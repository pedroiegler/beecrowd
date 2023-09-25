import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t, n;

        t = scanner.nextInt();

    	while (t != 0) {
    		for (int i = 1; i <= t; i++) {
    			n = scanner.nextInt();
    			if (n % 2 != 0) 
                    System.out.printf("%d%n", ((n * 2) - 1));
    			else 
                    System.out.printf("%d%n", ((n * 2) - 2));
    		}
    		
    		t = scanner.nextInt();
    	}

        scanner.close();
    }
}
