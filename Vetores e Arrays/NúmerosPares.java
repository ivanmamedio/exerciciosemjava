import java.util.Random;

public class NúmerosPares {
    public static void main(String[] args) {
        Random random = new Random();
        int[] númerosAleatórios = new int[20];

        // Gerar 20 números aleatórios
        for (int i = 0; i < númerosAleatórios.length; i++) {
            númerosAleatórios[i] = random.nextInt(100); // Números aleatórios entre 0 e 99
        }

        // Exibir apenas os números pares
        System.out.println("Números pares:");
        for (int número : númerosAleatórios) {
            if (número % 2 == 0) {
                System.out.println(número);
            }
        }
    }
}