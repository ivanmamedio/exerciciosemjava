import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço unitário do produto: R$ ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoTotal = precoUnitario * quantidade; 
        double desconto = 0.0;

        if (quantidade <= 5) {
            desconto = 0.0;
        } else if (quantidade <= 10) {
            desconto = 0.10; // 10% de desconto
        } else {
            desconto = 0.20; // 20% de desconto
        }

        double valorDesconto = precoTotal * desconto;
        }
    }
}