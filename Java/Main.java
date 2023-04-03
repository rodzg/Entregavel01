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
            
            Contagem item1 = new Contagem();
            item1.contar();
            break;

        case 2:
            Fibonacci item2 = new Fibonacci();
            item2.fibo();
            break;

        case 3:
            MDC item3 = new MDC();
            item3.mdc();
            break;

        case 4:
            OrdenarCrescente item4 = new OrdenarCrescente();
            item4.ordem();
            break;

        case 5:
            Primo item5 =  new Primo();
            item5.primo();
            break;

        case 6:
            Somatorio item6 = new Somatorio();
            item6.soma();
           break;
 }
 }
 }

