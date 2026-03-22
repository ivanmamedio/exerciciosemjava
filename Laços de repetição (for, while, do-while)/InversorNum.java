import java.util.Scanner;

public class InversorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.prit("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int invertido = 0;
        int original = numero;
        numero = Math.abs(numero); // para lidar com números negativos

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
    }
}