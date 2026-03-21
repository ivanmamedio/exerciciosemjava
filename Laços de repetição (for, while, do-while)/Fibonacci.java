import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci deseja?");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido.");
        } else {
            int primeiro = 0, segundo = 1;
            System.out.print("Sequencia: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(primeiro + " ");
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
            System.out.println();
        }
        scanner.close();
    }
}