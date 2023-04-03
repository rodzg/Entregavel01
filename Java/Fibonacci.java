import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos que você deseja ver na série Fibonacci: ");
        int n = sc.nextInt(); // número de termos da série Fibonacci que serão exibidos
        sc.close();
        
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série Fibonacci de " + n + " termos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
