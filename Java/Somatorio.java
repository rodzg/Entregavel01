import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = sc.nextInt();

        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
