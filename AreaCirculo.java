import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIgite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;
        System.out.printf("Área do círculo: %.2f%n", area);

        scanner.close();
    }
}