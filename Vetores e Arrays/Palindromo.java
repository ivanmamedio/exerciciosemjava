import java.util.Scanner; // Verifica se palavra/frase sem espaço é palindromo

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra (sem espaços): ");
        String texto = scanner.nextLine();

        boolean palindromo = true;
        int tamanho = texto.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (texto.charAt(i) != texto.charAt(tamanho - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo.");
        }
        scanner.close();
    }
}