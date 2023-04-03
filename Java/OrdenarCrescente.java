import java.util.Scanner;

public class OrdenacaoCrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = sc.nextInt();
        
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }
        
        vetor = ordenarCrescente(vetor);
        
        System.out.print("Vetor em ordem crescente: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
    
    public static int[] OrdenarCrescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
            }
        }
        return vetor;
    }
}
