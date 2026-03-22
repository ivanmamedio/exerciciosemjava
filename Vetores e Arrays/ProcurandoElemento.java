import java.util.Scanner;

public class ProcurandoElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número a ser procurado: ");
        int alvo = scanner.nextInt();

        boolean encontrado = false;
        System.out.print("Posições encontradas: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número não está presente no array.");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}