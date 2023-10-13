import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int T = scanner.nextInt();

            if (T == 0)
                break;

            int soma = 0;

            for (int i = 0; i < T; i++) {
                int N = scanner.nextInt();
                String alimento = scanner.nextLine().trim().toLowerCase(); 

                int quantidadeVitaminaC = 0;
                switch (alimento) {
                    case "suco de laranja":
                        quantidadeVitaminaC = 120;
                        break;
                    case "morango fresco":
                        quantidadeVitaminaC = 85;
                        break;
                    case "mamao":
                        quantidadeVitaminaC = 85;
                        break;
                    case "goiaba vermelha":
                        quantidadeVitaminaC = 70;
                        break;
                    case "manga":
                        quantidadeVitaminaC = 56;
                        break;
                    case "laranja":
                        quantidadeVitaminaC = 50;
                        break;
                    case "brocolis":
                        quantidadeVitaminaC = 34;
                        break;
                }

                soma += N * quantidadeVitaminaC;
            }

            if (soma >= 110 && soma <= 130) {
                System.out.println(soma + " mg");
            } else if (soma > 130) {
                System.out.println("Menos " + (soma - 130) + " mg");
            } else if (soma < 110) {
                System.out.println("Mais " + (110 - soma) + " mg");
            }
        }
    }
}
