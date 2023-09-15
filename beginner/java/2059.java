import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p, j1, j2, r, a;

        p = scanner.nextInt();
        j1 = scanner.nextInt();
        j2 = scanner.nextInt();
        r = scanner.nextInt();
        a = scanner.nextInt();

        int soma = j1 + j2;

        if(p == 1){
            if(soma % 2 == 0){
                if(r == 0){
                    if(a == 0 || a == 1){
                        System.out.println("Jogador 1 ganha!");
                    } 
                } else if(r == 1){
                    if(a == 0){
                        System.out.println("Jogador 1 ganha!");
                    } else if(a == 1){
                        System.out.println("Jogador 2 ganha!");
                    } 
                }
            } else{
            if(r == 0){
                    if(a == 0){
                        System.out.println("Jogador 2 ganha!");
                    } else if(a == 1){
                        System.out.println("Jogador 1 ganha!");
                    } 
                } else if(r == 1){
                    if(a == 0){
                        System.out.println("Jogador 1 ganha!");
                    } else if(a == 1){
                        System.out.println("Jogador 2 ganha!");
                    } 
                }   
            }
        } else if(p == 0){
            if(soma % 2 != 0){
                if(r == 0){
                    if(a == 0 || a == 1){
                        System.out.println("Jogador 1 ganha!");
                    } 
                } else if(r == 1){
                    if(a == 0){
                        System.out.println("Jogador 1 ganha!");
                    } else if(a == 1){
                        System.out.println("Jogador 2 ganha!");
                    } 
                }
            } else{ 
            if(r == 0){
                    if(a == 0){
                        System.out.println("Jogador 2 ganha!");
                    } else if(a == 1){
                        System.out.println("Jogador 1 ganha!");
                    } 
                } else if(r == 1){
                    if(a == 0){
                        System.out.println("Jogador 1 ganha!");
                    } else if(a == 1){
                        System.out.println("Jogador 2 ganha!");
                    } 
                }   
            }
        }

        scanner.close();
    }
}
