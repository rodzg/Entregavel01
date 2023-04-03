import java.util.Scanner;

public class MDC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        sc.close();
        
        int mdc = encontrarMDC(num1, num2);
        System.out.println("O maior divisor comum entre " + num1 + " e " + num2 + " é: " + mdc);
    }
    
    public static int encontrarMDC(int num1, int num2) {
        while (num2 != 0) {
            int resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }
        return num1;
    }
}
