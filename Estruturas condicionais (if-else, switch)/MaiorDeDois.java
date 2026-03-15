import java.util.Scanner;

public class MaiorDeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        if (a > b)
            System.out.println("O maior número é: " + a);
    }   else if (b > a) {
            System.out.println("O maior número é: " + b);
    }    else {
            System.out.println("Os números são iguais.");
    }
    }
}