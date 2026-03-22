import java.util.Scanner;

public class ProcurandoElemento {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
    }
}