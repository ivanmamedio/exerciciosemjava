import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // entre 1 e 100
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Maior! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Menor! Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}