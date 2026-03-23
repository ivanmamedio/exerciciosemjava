import java.util.Scanner; // trocar todas as ocorrências de uma letra por outra

public class SubstCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a letra a ser subtituída: ");
        char antigo = scanner.next().charAt(0);

        System.out.print("Digite uma nova letra: ");
        char nobo = scanner.next().charAt(0);
    }
}