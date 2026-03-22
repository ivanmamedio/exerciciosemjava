import java.util.Scanner;

public class MaiorMenorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior)
                maior = num;
            if (num < menor)
                menor = num;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        scanner.close();
    }
}