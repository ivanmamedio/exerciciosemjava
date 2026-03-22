public class Multiplos3e5 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println("Soma de múltiplos de 3 ou 5 entre 1 e 500: " + soma);
    }
}