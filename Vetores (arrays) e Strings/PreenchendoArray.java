public class PreenchendoArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        // Preenchendo com números de 1 a 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Imprimindo o array
        System.out.print("Array: ");
        for (int num : numeros) {
            System.out.print(num + " ");

        }
    }
}