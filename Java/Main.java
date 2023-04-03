import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Digite o número da função que deseja executar: ");
System.out.println("1 - NumerosInteiros");
System.out.println("2 - Fibonacci");
System.out.println("3 - MDC");
System.out.println("4 - OrdenacaoCrescente");
System.out.println("5 - Primo");
System.out.println("6 - Somatorio");
int opcao = sc.nextInt();

    switch (opcao) {
        case 1:
            System.out.print("Digite a quantidade de números que você deseja inserir: ");
            int quantidadeNumeros = sc.nextInt();
            int numerosInteiros = 0;
            for (int i = 0; i < quantidadeNumeros; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                double numero = sc.nextDouble();
                if (numero == (int) numero) {
                    numerosInteiros++;
                }
            }
            System.out.println("A quantidade de números inteiros é: " + numerosInteiros);
            break;

        case 2:
            System.out.print("Digite o número de termos que você deseja ver na série Fibonacci: ");
            int n = sc.nextInt();
            int primeiroTermo = 0;
            int segundoTermo = 1;
            System.out.println("Série Fibonacci de " + n + " termos:");
            for (int i = 1; i <= n; i++) {
                System.out.print(primeiroTermo + " ");
                int proximoTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
            break;

        case 3:
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();
            int mdc = encontrarMDC(num1, num2);
            System.out.println("O maior divisor comum entre " + num1 + " e " + num2 + " é: " + mdc);
            break;

        case 4:
            System.out.print("Digite o tamanho do vetor: ");
            int tamanhoVetor = sc.nextInt();
            int[] vetor = new int[tamanhoVetor];
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = sc.nextInt();
            }
            vetor = ordenarCrescente(vetor);
            System.out.print("Vetor em ordem crescente: ");
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
            break;

        case 5:
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            boolean ehPrimo = verificarPrimo(num);
            if (ehPrimo) {
                System.out.println(num + " é um número primo");
            } else {
                System.out.println(num + " não é um número primo");
            }
            break;

        case 6:
            System.out.print("Digite o tamanho do vetor: ");
            int tamVetor = sc.nextInt();
            int[] vetorSomatorio = new int[tamVetor];
            for (int x=0; x < tamVetor; x++){
                vetorSomatorio[x] = sc.nextInt();
                int soma =0
                soma = soma + vetorSomatorio[x];
            }System.out.println(soma);
