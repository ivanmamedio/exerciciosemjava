import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
            if (!senha.equals("1234")) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals("1234"));

        System.out.println("Acesso permitido!");
        scanner.close();
    }
}