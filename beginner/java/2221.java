import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, bonus, at1, at2, df1, df2, lvl1, lvl2;

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            bonus = scanner.nextInt();

            at1 = scanner.nextInt();
            df1 = scanner.nextInt();
            lvl1 = scanner.nextInt();

            at2 = scanner.nextInt();
            df2 = scanner.nextInt();
            lvl2 = scanner.nextInt();

            int golpe1 = ((at1 + df1) / 2);
            int golpe2 = ((at2 + df2) / 2);

            if(lvl1 % 2 == 0)
                golpe1 += bonus;
            if(lvl2 % 2 == 0)
                golpe2 += bonus;

            if(golpe1 > golpe2)
                System.out.println("Dabriel");
            else if(golpe2 > golpe1)
                System.out.println("Guarte");
            else
                System.out.println("Empate");

        }

        scanner.close();
    }
}
