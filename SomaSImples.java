import java.util.Scanner;

public class SomaSImples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();

        int soma = a + b;
        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}