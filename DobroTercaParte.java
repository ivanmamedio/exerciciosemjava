import java.util.Scanner;

public class DobroTercaParte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double tercaParte = numero / 3;

        System.out.printf("Dobro: %.2f%n", dobro);
        System.out.printf("Terça parte: %.3f%n", tercaParte);

        scanner.close();
    }
}