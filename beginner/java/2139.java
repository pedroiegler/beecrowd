import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes, dia;
    
        while (scanner.hasNext()) {

            mes = scanner.nextInt();
            dia = scanner.nextInt();

            int[] dias_no_mes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25};
            int dias_faltando;

            if (mes == 12 && dia == 25) {
                System.out.printf("E natal!%n");
            } else if (mes == 12 && dia == 24) {
                System.out.printf("E vespera de natal!%n");
            } else if (mes == 12 && dia > 25) {
                System.out.printf("Ja passou!%n");
            } else {
                dias_faltando = dias_no_mes[mes - 1] - dia;
                for (int i = mes; i < 12; i++) {
                    dias_faltando += dias_no_mes[i];
                }
                System.out.printf("Faltam %d dias para o natal!%n", dias_faltando);
            }
        }

        scanner.close();
    }
}
