import java.util.Scanner;

public class DesenhoRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Largura do retângulo: ");
        int largura = scanner.nextInt();
        System.out.print("Altura do retângulo: ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("* ");
            }
            System.out.println(); // nova linha após cada linha do retângulo
        }
        scanner.close();
    }
}