import java.util.Scanner;

public class Soma1aN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        
        int n = scanner.nextInt();
        
        int soma = 0;
        for (int i = 1; i <= n; i++); {
            soma += 1;
        }
        
        System.out.println("Soma de 1 até " + n + " = " + soma);
        
        scanner.close();
    }
}