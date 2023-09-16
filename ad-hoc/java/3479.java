import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        String[] datas = data.split("/");

        int dia = Integer.parseInt(datas[0]);
        int mes = Integer.parseInt(datas[1]);

        if((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20))
            System.out.printf("aries\n");
        else if((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20))
            System.out.printf("touro\n");
        else if((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20))
            System.out.printf("gemeos\n");
        else if((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22))
            System.out.printf("cancer\n");
        else if((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22))
            System.out.printf("leao\n");
        else if((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22))
            System.out.printf("virgem\n");
        else if((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22))
            System.out.printf("libra\n");
        else if((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21))
            System.out.printf("escorpiao\n");
        else if((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21))
            System.out.printf("sagitario\n");
        else if((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19))
            System.out.printf("capricornio\n");
        else if((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18))
            System.out.printf("aquario\n");
        else if((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20))
            System.out.printf("peixes\n");

        scanner.close();
    }
}
