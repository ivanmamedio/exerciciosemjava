import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double c = scanner.nextDouble();

        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("O maior é: " + maior);

        scanner.close();
    }
}