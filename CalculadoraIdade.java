import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2026; // ano fixo 
        int idade = anoAtual - anoNascimento;

        System.out.println("Idade aproximada: " + idade + " anos");

        scanner.close();
    }
}