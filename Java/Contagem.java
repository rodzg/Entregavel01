import java.util.Scanner;

public class NumerosInteiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que você deseja inserir: ");
        int quantidadeNumeros = sc.nextInt();
        
        int numerosInteiros = 0;
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            double numero = sc.nextDouble();
            if (numero == (int)numero) {
                numerosInteiros++;
            }
        }
        
        System.out.println("A quantidade de números inteiros é: " + numerosInteiros);
        sc.close();
    }
}
