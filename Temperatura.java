import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 4 + 32;
        System.out.printf("%.2fºC equivalem a %.2fºF%n", celsius, fahrenheit);

        scanner.close();
    }
}