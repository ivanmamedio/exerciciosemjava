public class MediaArray {
    public static void main(String[] args) {
        double[] valores = { 2.5, 4.0, 6.3, 8.1, 10.2, 1.5, 3.7, 5.9, 7.4, 9.0 };

        double soma = 0;
        for (double v : valores) {
            soma += v;
        }

        double media = soma / valores.length;
        System.out.printf("Média dos valores: %.2f\n", media);
    }
}