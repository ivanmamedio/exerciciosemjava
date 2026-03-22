public class NumPerf {
    public static void main(String[] args) {
        System.out.println("Número perfeitos entre 1 e 1000:");
        for (int num = 1; num <= 1000; num++) {
            int somaDivisores = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }
            if (somaDivisores == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // linha final
    }
}