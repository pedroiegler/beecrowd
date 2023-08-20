import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (scanner.hasNextLine()) {
            String crow = scanner.nextLine();
            
            if (crow.equals("caw caw")) {
                System.out.println(sum);
                sum = 0;
            } else {
                if (crow.equals("--*"))
                    sum += 1;

                if (crow.equals("-*-"))
                    sum += 2;

                if (crow.equals("*--"))
                    sum += 4;

                if (crow.equals("---"))
                    sum += 0;

                if (crow.equals("***"))
                    sum += 7;

                if (crow.equals("**-"))
                    sum += 6;

                if (crow.equals("-**"))
                    sum += 3;

                if (crow.equals("*-*"))
                    sum += 5;
            }
        }
    }
}
