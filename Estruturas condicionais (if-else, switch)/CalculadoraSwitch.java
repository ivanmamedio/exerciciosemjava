import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha o operado (+ - * /): ");
        char operador = scanner.next().charAt(0);

        double resultado;
        boolean operacaoValida = true;

        switch (operador) {}
    }
}