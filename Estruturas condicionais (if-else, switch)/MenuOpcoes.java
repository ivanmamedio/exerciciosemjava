import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Saudação");
            System.out.println("2 - Mostrar data");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer
            
            switch (opcao) {
                case 1:
                    System.out.println("Olá! Seja bem-vindo!");
                    break;
                case 2:
                    LocalDate hoje = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
                    System.out.println("Data atual: " + hoje.format(formatter));
                    break;
                case 3:
                    System.out.println("Encerrando o programa....");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente,");
            }
        } while (opcao != 3);

            scanner.close();
    }
}