import java.util.Scanner;

public class ContandoVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vogais: " + contador);
        scanner.close();
    }
}