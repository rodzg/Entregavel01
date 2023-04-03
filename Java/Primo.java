import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();

        boolean ehPrimo = verificarPrimo(num);

        if (ehPrimo) {
            System.out.println(num + " é um número primo");
        } else {
            System.out.println(num + " não é um número primo");
        }
    }

    public static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
