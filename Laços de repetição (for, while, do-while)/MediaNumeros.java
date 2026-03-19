import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        int contador = 0;
        
        System.out.println("Digite números para calcular a média (0 para sair):");
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                soma += numero;
                contador++;
            }
            
        } while (numero != 0);
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos números lidos: " + media);
            
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        
            
        scanner.close();
    }
}